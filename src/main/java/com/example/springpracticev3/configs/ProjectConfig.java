package com.example.springpracticev3.configs;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.springpracticev3.proxies")
public class ProjectConfig {
}
