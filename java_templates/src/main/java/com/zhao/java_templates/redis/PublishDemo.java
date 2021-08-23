package com.zhao.java_templates.redis;

public class PublishDemo {
    public static void main(String[] args) {
        String channel="test";
        RedisSubscribe subscribe = new RedisSubscribe();
        subscribe.run(channel);
    }
}
