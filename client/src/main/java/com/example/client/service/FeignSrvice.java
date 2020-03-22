package com.example.client.service;

import com.example.common.User;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

// feifnClient的fallback是feign对断路器的支持
@FeignClient(name = "SERVER-POWER", fallback = FeignServiceImpl.class)
public interface FeignSrvice {
    //用feign获取数据


    @RequestMapping(value = "updateUser", method = RequestMethod.GET)
    User updateUser(@RequestBody(required = false) User user);

    @RequestMapping(value = "power.do", method = RequestMethod.GET)
    Object getPower();



}
