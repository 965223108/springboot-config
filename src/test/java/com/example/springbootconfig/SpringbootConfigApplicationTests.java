package com.example.springbootconfig;

import com.example.springbootconfig.beans.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class SpringbootConfigApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc;
    @Test
    void contextLoads() {
    }

    @Test
    public void testConfig()
    {
        System.out.println(person);
        System.out.println(ioc.containsBean("helloService"));
    }

}
