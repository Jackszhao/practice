package com.zhao.java_templates.redis.pub_sub;

public class PublishDemo {
    public static void main(String[] args) {
        String channel="test";
        RedisSubscribe subscribe = new RedisSubscribe();
        subscribe.run(channel);
    }
}
