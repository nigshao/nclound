package com.example.client.service;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHelloService() {
        return restTemplate.getForEntity("http://say-hello/myFirst?name=jackman", String.class).getBody();
    }
    public Object getUser() {
        return restTemplate.getForEntity("http://say-hello/getUser", Object.class).getBody();
    }

   /* @HystrixCommand(fallbackMethod ="hystrixError")
    public  String  hiHystrix(){
	   return restTemplate.getForEntity("http://say-hello/myFirst?name=jackman", String.class).getBody();
    }
    public String hystrixError(){
    	return "掉取服务失败,断路器：hystrixError";
    }*/
}