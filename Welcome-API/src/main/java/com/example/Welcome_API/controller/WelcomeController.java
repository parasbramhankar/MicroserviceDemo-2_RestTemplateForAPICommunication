package com.example.Welcome_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/welcome")
    public String welcome(){

        String forObj=restTemplate.getForObject("http://localhost:8081/api/greet",String.class);

        return forObj+" paras";
    }
}
