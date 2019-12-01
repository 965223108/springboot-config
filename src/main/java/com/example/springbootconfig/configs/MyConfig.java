package com.example.springbootconfig.configs;

import com.example.springbootconfig.beans.HelloService;
import com.example.springbootconfig.beans.MyViewResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    private Logger logger=LoggerFactory.getLogger(MyConfig.class);
    @Bean
    public HelloService helloService()
    {
        logger.trace("trace log");
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
        return new HelloService();
    }
    @Bean
    public MyViewResolver myViewResolver()
    {
        return new MyViewResolver();
    }
}
