package com.example.microservices.limitsservice.controllers;

import com.example.microservices.limitsservice.Bean.Limits;
import com.example.microservices.limitsservice.Configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMin(),configuration.getMax());
    }
}
