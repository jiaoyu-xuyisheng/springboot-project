package com.jiaoyu.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;


import com.jiaoyu.providetickter.service.TickerService;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Reference
    TickerService tickerService;

    public void hello(){
        String ticket = tickerService.getTicker();
        System.out.println("买到票了："+ticket);
    }


}
