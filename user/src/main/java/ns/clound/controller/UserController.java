package ns.clound.controller;


import ns.clound.util.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getPower.do")
    public Object getPower() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("returnValue", restTemplate.getForObject("http://localhost:6000/getPower.do", Object.class));
        return ResponseEntity.ok(map);

    }
}