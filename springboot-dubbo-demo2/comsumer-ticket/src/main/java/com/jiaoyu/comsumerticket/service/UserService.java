package com.jiaoyu.comsumerticket.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiaoyu.provideticket.service.TicketService;



@Service
public class UserService implements TicketService{

    @Reference
    TicketService ticketService;



    @Override
    public String getTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("买到票了"+ticket);
        return "买到票了"+ticket;
    }
}
