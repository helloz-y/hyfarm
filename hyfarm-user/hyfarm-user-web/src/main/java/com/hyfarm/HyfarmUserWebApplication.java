package com.hyfarm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.hyfarm.mapper")
@SpringBootApplication
public class HyfarmUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyfarmUserWebApplication.class, args);
    }

}
