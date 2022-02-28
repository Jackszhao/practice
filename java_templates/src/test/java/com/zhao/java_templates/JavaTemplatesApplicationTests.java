package com.zhao.java_templates;

import com.zhao.java_templates.redis.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JavaTemplatesApplicationTests {

    @Resource
    public RedisUtil redisUtil;
    @Test
    void contextLoads() {
        redisUtil.set("hello","world");
        Object hello = redisUtil.get("hello");
        System.out.println(hello);

        Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("123456");
        Transaction transaction = jedis.multi();//开启事务
        transaction.lpush("key", "11");//向列表中插入数据
        transaction.lpush("key", "22");
        transaction.lpush("key", "33");
        String discard = transaction.discard();//取消事务
        System.out.println(discard);
//        transaction.del("key");
//        List<Object> list = transaction.exec();//提交事务
        List<Object> key = redisUtil.lGet("key", 0, 8);
        for (Object o: key) {
            System.out.println(o.toString());
        }
    }

}
