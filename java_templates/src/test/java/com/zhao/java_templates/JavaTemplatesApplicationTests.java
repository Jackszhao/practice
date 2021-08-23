package com.zhao.java_templates;

import com.zhao.java_templates.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
class JavaTemplatesApplicationTests {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    public RedisUtil redisUtil;
    @Test
    void contextLoads() {
        ValueOperations vo = redisTemplate.opsForValue();
        vo.set("test", "ceshi");
        Object test = vo.get("test");
        System.out.println(test);
        redisUtil.set("hello","world");
        Object hello = redisUtil.get("hello");
        System.out.println(hello);
    }

}
