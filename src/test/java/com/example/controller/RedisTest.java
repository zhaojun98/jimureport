package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisTest {
    @Autowired
    public RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        System.out.println("123");
        System.out.println(redisTemplate.getConnectionFactory().getConnection());
        redisTemplate.opsForValue().set("1", "1");
        redisTemplate.opsForValue().get("1");
        System.out.println(redisTemplate.opsForValue().get("login_tokens:23c777fb-ba14-45ca-8e3b-b491bee86d0c"));
    }
}