package com.zjj.cache;

import com.zjj.cache.bean.Employee;
import com.zjj.cache.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate empRedisTemplate;

    @Test
    public void contextLoads() {
       /* Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);*/
    }

    @Test
    public void test1(){
        Employee empById = employeeMapper.getEmpById(1);
       redisTemplate.opsForValue().set("emp-01",empById,5, TimeUnit.MINUTES);

    }

    @Test
    public void test2(){
        Employee empById = employeeMapper.getEmpById(1);
        empRedisTemplate.opsForValue().set("emp-01",empById,5, TimeUnit.MINUTES);

    }

}
