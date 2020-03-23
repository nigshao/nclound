package com.example.client.controller;

import com.example.client.service.FeignSrvice;
import com.example.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

@RestController
@RequestMapping("/client")
public class ClientController {

    private static final String URL = "http://SERVER-POWER";

    @Autowired
    RestTemplate restTemplate;


    @Autowired
    FeignSrvice feignSrvice;

    @Value("${testUser.name}")
    private String name;
    
    @Value("${testUser.age}")
    private Integer age;


    //rabbion  调用
    @RequestMapping("/power.do")
    private Object getPower() {
        // return restTemplate.getForObject(URL+"/power.do",Object.class);
        return feignSrvice.getPower();
    }

    //feigon 调用
    @GetMapping("/updateUser")
    private Object updateUser() {
        User user = new User();
        user.setAge(12);
        return feignSrvice.updateUser(user);
    }

    @GetMapping("/testName.do")
    private Object testName() {
        return "name: " + name + "age: " + age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
