package com.jiaoyu.rabbit;

import com.jiaoyu.rabbit.bean.Book;
import com.jiaoyu.rabbit.config.RabbitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void setRabbitMessage() {
        Book book = new Book("My JAVA BOOK2266", "XuYisheng");
        rabbitTemplate.convertAndSend("exchange.direct","jiaoyu.news",book);
    }
    @Test
    void getRabbitMessage() {
        Book o = (Book) rabbitTemplate.receiveAndConvert("jiaoyu.news");System.out.println(o); }
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void send() { Book book=new Book("Python is veryMuch","XiaoLi");
        amqpTemplate.convertAndSend(RabbitConfig.FANOUT_EXCHANGE, "", book); }
    @Test
    void getAmqpRabbitMessage() {
        Book o = (Book)amqpTemplate.receiveAndConvert("fanout.queue1");System.out.println(o); }








}
