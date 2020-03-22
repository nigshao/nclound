package com.example.power1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//服务提供者
@EnableDiscoveryClient
@SpringBootApplication
public class Power1Application {

    public static void main(String[] args) {
        SpringApplication.run(Power1Application.class, args);
    }

}
