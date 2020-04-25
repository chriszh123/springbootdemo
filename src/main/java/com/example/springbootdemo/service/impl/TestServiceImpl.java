package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dto.FacBuyer;
import com.example.springbootdemo.dto.config.EmailConfig;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private EmailConfig emailConfig;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<FacBuyer> selectBuyers() {
        String xxx = emailConfig.getMailServiceAddress();
        return this.userMapper.selectBuyers();
    }
}
