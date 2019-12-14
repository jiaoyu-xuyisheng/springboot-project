package com.jiaoyu.providertickter.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(timeout = 3000)
public class TickerServiceImpl implements  TickerService{
    @Override
    public String getTicker() {
        return "<<我和我的祖国>>";
    }
}
