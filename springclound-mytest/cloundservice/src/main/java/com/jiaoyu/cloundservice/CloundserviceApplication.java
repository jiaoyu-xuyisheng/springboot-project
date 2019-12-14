package com.jiaoyu.cloundservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//注册中心
//启用
@EnableEurekaServer
@SpringBootApplication
public class CloundserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloundserviceApplication.class, args);
    }

}
