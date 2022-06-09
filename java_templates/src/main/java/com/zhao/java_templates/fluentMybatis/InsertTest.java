package com.zhao.java_templates.fluentMybatis;

import com.zhao.java_templates.fluentMybatis.entity.HelloWorldEntity;
import com.zhao.java_templates.fluentMybatis.mapper.HelloWorldMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class InsertTest {
    @Resource
    HelloWorldMapper mapper;

    @Test
    public void testInsertDefaultValue() {
        // 全表清空
        mapper.delete(mapper.query().where.apply("1=1").isTrue().end());
        // 插入记录，未设置gmtCreated, gmtModified, isDeleted3个字段
        mapper.insert(new HelloWorldEntity()
                .setSayHello("hello")
                .setYourName("fluent mybatis")
        );
        // 查询并在控制台输出记录
        HelloWorldEntity entity = mapper.findOne(mapper.query()
                .where.sayHello().eq("hello")
                .and.yourName().eq("fluent mybatis").end()
        );
        System.out.println(entity.toString());
    }
}