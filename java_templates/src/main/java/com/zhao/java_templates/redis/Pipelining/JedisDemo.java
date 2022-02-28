package com.zhao.java_templates.redis.Pipelining;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.Pipeline;
/*
redis使用管道(Pipelining)提高查询速度
*/
public class JedisDemo {

    private static final int COMMAND_NUM = 1000;

    private static final String REDIS_HOST = "localhost";

    public static void main(String[] args) {
        //这里是连接的本地地址和端口
        JedisShardInfo shardInfo = new JedisShardInfo("redis://localhost:6379/1");
        //这里是密码
        shardInfo.setPassword("123456");
        Jedis jedis = new Jedis(shardInfo);
        withoutPipeline(jedis);
        withPipeline(jedis);
    }

    private static void withoutPipeline(Jedis jedis) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < COMMAND_NUM; i++) {
            jedis.set("no_pipe_" + i, String.valueOf(i));
        }
        long end = System.currentTimeMillis();
        long cost = end - start;
        System.out.println("withoutPipeline cost : " + cost + " ms");
    }

    private static void withPipeline(Jedis jedis) {
        Pipeline pipe = jedis.pipelined();
        long startPipe = System.currentTimeMillis();
        for (int i = 0; i < COMMAND_NUM; i++) {
            pipe.set("pipe_" + i, String.valueOf(i));
        }
        pipe.sync(); // 获取所有的response
        long endPipe = System.currentTimeMillis();
        long costPipe = endPipe - startPipe;
        System.out.println("withPipeline cost : " + costPipe + " ms");
    }
}