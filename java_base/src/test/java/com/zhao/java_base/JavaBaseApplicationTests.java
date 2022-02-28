package com.zhao.java_base;

import com.zhao.java_base.DelayQueueDemo.DelayedQueueConsumer;
import com.zhao.java_base.DelayQueueDemo.DelayedQueueProducer;
import com.zhao.java_base.DelayQueueDemo.DelayedUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class JavaBaseApplicationTests {

    @Test
    void contextLoads() throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        DelayQueue<DelayedUser> queue = new DelayQueue<>();
        int messageCount = 2;
        long delayTime = 500;
        DelayedQueueProducer producer = new DelayedQueueProducer(queue, messageCount, delayTime);
        DelayedQueueConsumer consumer = new DelayedQueueConsumer(queue, messageCount);


        // when
        executor.submit(producer);
        executor.submit(consumer);

        // then
        executor.awaitTermination(5, TimeUnit.SECONDS);
        executor.shutdown();


    }


}
