package com.zhao.java_templates.redis;

import redis.clients.jedis.Jedis;

public class RedisSubscribe {
    public void run(String channel){
        // 生产环境千万不要这么使用哦，推荐使用 JedisPool 线程池的方式
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("123456");
        jedis.subscribe(new MyListener(), channel);
    }


}
