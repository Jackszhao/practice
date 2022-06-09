package com.zhao.java_templates.redis.Lua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LuaTest {
    @Autowired
    private static RedisTemplate redisTemplate;

    @Autowired
    private static DefaultRedisScript<Long> redisScript;
    public static void main(String[] args) {
            List<String> keys = Collections.singletonList("aaa");
            // 10秒内小于或等于3次时返回1，否则返回0
            for (int i = 0; i < 4; i++) {
                Object execute = redisTemplate.execute(redisScript, keys, 10, 3);
                System.out.println(execute);
            }
    }
}
