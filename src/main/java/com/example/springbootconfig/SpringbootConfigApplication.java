package com.example.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/*

    命令行模式：
            --spring.profiles.active=dev
            --spring.config.location=
    虚拟机参数
            -Dspring.profiles.active=dev


    四个默认加载 地方：
                    1. file:/config/
                    2.file:/
                    3.classpath:/config/
                    4.classpath:/
     外部配置文件的加载顺序（以参数的形式和外部配置文件的形式）：
                            1. java -jar test.jar --server.port=111
                            2.  优先加载profile 在来加载不带profile的
 */

//@ImportResource(locations = {"classpath:defaultSpring.xml"})


@SpringBootApplication
public class SpringbootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigApplication.class, args);
    }

}
