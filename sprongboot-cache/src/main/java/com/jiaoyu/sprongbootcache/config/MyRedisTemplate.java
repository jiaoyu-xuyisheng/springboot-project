package com.jiaoyu.sprongbootcache.config;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;


public class MyRedisTemplate<T, V> extends RedisTemplate {
    public MyRedisTemplate() {
        this.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
    }
}
