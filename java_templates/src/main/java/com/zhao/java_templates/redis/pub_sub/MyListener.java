package com.zhao.java_templates.redis.pub_sub;

import redis.clients.jedis.JedisPubSub;

public class MyListener extends JedisPubSub {
    @Override
    public void onMessage(String channel, String message) {
        System.out.println("收到订阅频道：" + channel + " 消息：" + message);
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("收到具体订阅频道：" + channel + "订阅模式：" + pattern + " 消息：" + message);
    }

}