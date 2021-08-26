package com.zhao.java_templates.Forest;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyService {
    @Resource
    private MyClient myClient;

    public void testClient() {
        String result = myClient.helloForest();
        System.out.println(result);
    }

}
