package com.example.springbootdemo.dto.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/test.properties")
@Data
public class EmailConfig {
    @Value("${api.aliyun.email.mail.host}")
    private String mailHost;

    @Value("${api.aliyun.email.mail.transport.protocol}")
    private String mailTransportProtocol;

    @Value("${api.aliyun.email.mail.service.address}")
    private String mailServiceAddress;

    @Value("${api.aliyun.email.mail.service.password}")
    private String mailServicePassword;
}
