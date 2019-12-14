package com.jiaoyu.rabbit.service;

import com.jiaoyu.rabbit.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "jiaoyu.news")
    public void receive(Book o){
        System.out.println("我收到的消息"+o.toString());
    }

}
