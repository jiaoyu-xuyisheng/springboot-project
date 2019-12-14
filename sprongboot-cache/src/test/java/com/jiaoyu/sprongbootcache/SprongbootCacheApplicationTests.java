package com.jiaoyu.sprongbootcache;

import com.jiaoyu.sprongbootcache.bean.Employee;
import com.jiaoyu.sprongbootcache.config.MyRedisTemplate;
import com.jiaoyu.sprongbootcache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;


@SpringBootTest
class SprongbootCacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void getRedisValue() {
        String s = stringRedisTemplate.opsForValue().get("xuyisheng");
        System.out.println(s);
    }

    @Test
    void getEmployeeById() {
        Employee employee = employeeMapper.getEmpById(1);
        System.out.println(employee.toString());
    }

    @Test
    void contextLoads() {
    }


    @Autowired
    private MyRedisTemplate myRedisTemplat;

    @Test
    void getList() {
        Employee emp = employeeMapper.getEmpById(1);
        myRedisTemplat.opsForValue().set("emp-02", emp);
        System.out.println("ok");
    }


}
