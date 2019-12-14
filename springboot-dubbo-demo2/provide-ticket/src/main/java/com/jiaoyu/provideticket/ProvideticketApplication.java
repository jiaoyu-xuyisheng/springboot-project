package com.jiaoyu.provideticket;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class ProvideticketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideticketApplication.class, args);
    }

}
