package com.example.consul.dollarconversionservice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Data
public class AppConfig {
    @Value("${inr}")
    private String inrValue;

    @Value("${aud}")
    private String audValue;

    @Value("${euro}")
    private String eurValue;



}
