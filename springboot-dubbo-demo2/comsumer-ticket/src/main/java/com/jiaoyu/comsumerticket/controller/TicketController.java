package com.jiaoyu.comsumerticket.controller;


import com.jiaoyu.comsumerticket.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TicketController {

    @Resource
    UserService userService;

    @GetMapping("/getOne")
    public String getTicket(){
        return userService.getTicket();
    }
}
