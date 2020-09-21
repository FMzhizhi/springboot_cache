package com.zjj.cache.config;

import org.apache.ibatis.annotations.Param;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/7/18 15:16
 */
@Configuration
public class MyCacheConfig {

    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator(){

        return new KeyGenerator(){

            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName()+"["+ Arrays.asList(objects).toString() +"]";
            }
        };
    }
}
