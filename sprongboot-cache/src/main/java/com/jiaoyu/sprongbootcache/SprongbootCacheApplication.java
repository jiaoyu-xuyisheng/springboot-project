package com.jiaoyu.sprongbootcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@MapperScan("com.jiaoyu.sprongbootcache.mapper")
@SpringBootApplication
@EnableCaching
public class SprongbootCacheApplication {

    /**
     * org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SprongbootCacheApplication.class, args);
    }

}
