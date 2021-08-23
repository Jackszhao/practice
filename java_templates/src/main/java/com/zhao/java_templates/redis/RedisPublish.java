package com.zhao.java_templates.redis;

import redis.clients.jedis.Jedis;

public class RedisPublish {
    public static void main(String[] args) {
        RedisPublish publish = new RedisPublish();
        publish.run("test","获取有效信息！");
    }
    public void run(String channel,String message){
    // 生产环境千万不要这么使用哦，推荐使用 JedisPool 线程池的方式
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("123456");
        jedis.publish(channel, message);
    }
}
