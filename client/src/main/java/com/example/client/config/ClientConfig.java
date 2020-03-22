package com.example.client.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {

    @LoadBalanced //加上这个注解就开启了 ribbon的负载均衡
    @Bean
    RestTemplate  restTemplate(){
        RestTemplate  restTemplate = new RestTemplate();
        return restTemplate;
    }
}
