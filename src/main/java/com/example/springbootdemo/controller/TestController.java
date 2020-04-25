package com.example.springbootdemo.controller;

import cn.hutool.json.JSONUtil;
import com.example.springbootdemo.dto.FacBuyer;
import com.example.springbootdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        List<FacBuyer> buyers = this.testService.selectBuyers();
        return JSONUtil.toJsonStr(buyers);
    }
}
