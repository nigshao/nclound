package com.example.client.controller;

import com.example.client.service.FeignSrvice;
import com.example.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

@RestController
@RequestMapping("/client")
public class ClientController {

    private static  final String  URL  = "http://SERVER-POWER";

    @Autowired
    RestTemplate  restTemplate;




    @Autowired
    FeignSrvice  feignSrvice;

    //rabbion  调用
    @RequestMapping("/power.do")
    private Object  getPower(){
      // return restTemplate.getForObject(URL+"/power.do",Object.class);
      return feignSrvice.getPower();
    }
    //feigon 调用
    @GetMapping("/updateUser")
    private Object  updateUser(){
        User  user  = new User();
        user.setAge(12);
        return  feignSrvice.updateUser(user);
    }
}
