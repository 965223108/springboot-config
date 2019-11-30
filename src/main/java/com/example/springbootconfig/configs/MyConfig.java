package com.example.springbootconfig.configs;

import com.example.springbootconfig.beans.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService()
    {
        return new HelloService();
    }
}
