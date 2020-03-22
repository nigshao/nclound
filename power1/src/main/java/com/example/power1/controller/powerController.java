package com.example.power1.controller;


import com.example.common.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class powerController {
    //服务提供者
    @GetMapping("/power.do")
    public Object getPower(){
        int i = 0;
        int c = 5 / i;
        Map<String, Object> map = new HashMap<>();
        map.put("ok", "this is power");
        return map;
    }

    @GetMapping("/updateUser")
    public User updateUser(@RequestBody(required = false) User user) throws InterruptedException {
        user.setName("张三");
        return user;
    }
}
