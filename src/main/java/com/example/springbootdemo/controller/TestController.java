package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${biz.test.hello}")
    private String controllerLbl;

    @GetMapping("/hello")
    public String hello() {
        return controllerLbl;
    }
}
