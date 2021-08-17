package com.zhao.java_templates.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/set")
    public void set(String student){
        redisTemplate.opsForValue().set("student",student);
    }
}
