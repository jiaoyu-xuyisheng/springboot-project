package com.jiaoyu.myemail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class MyemailApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    void sendMail(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("今晚开会");//设置标题
        mailMessage.setText("今晚7：30开会！");//设置内容
        mailMessage.setTo("18923415092@163.com");//设置要发送的邮箱
        mailMessage.setFrom("422062338@qq.com");//设置发送邮箱的人
        javaMailSender.send(mailMessage);
    }
    @Test
    void sendMail02() throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("今晚开会02");//设置标题
        helper.setText("<h1 style='color:red'>今晚7：30开会！</h1>",true);
        helper.setTo("18923415092@163.com");helper.setFrom("422062338@qq.com");
        helper.addAttachment("guess4.jpg",new File("D:\\rar\\jiuxian\\jiuxian\\img\\shopcartimg\\guess4.jpg"));
        helper.addAttachment("guess5.jpg",new File("D:\\rar\\jiuxian\\jiuxian\\img\\shopcartimg\\guess5.jpg"));
        javaMailSender.send(mimeMessage);
    }

}
