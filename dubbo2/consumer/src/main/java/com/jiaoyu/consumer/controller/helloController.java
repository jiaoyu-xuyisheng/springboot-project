package com.jiaoyu.consumer.controller;

import com.jiaoyu.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public void hello(){
        userService.hello();
    }
}
