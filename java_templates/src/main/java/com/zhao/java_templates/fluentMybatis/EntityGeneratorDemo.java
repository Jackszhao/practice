package com.zhao.java_templates.fluentMybatis;

import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.*;
import org.junit.Test;

public class EntityGeneratorDemo {
    // 数据源 url
    static final String url = "jdbc:mysql://localhost:3306/fluent_mybatis?useUnicode=true&characterEncoding=utf8";
    // 数据库用户名
    static final String username = "root";
    // 数据库密码
    static final String password = "123456";


    @Test
    public void generate() throws Exception {
        // 引用配置类，build方法允许有多个配置类
        FileGenerator.build(Empty.class);
    }

    @Tables(
            // 设置数据库连接信息
            url = url, username = username, password = password,
            // 设置entity类生成src目录, 相对于 user.dir
            srcDir = "src/main/java",
            // 设置entity类的package值
            basePack = "com.zhao.java_templates.fluentMybatis",
            // 设置dao接口和实现的src目录, 相对于 user.dir
            daoDir = "src/main/java",
            // 设置哪些表要生成Entity文件
            tables = {@Table(value = {"hello_world"})}
    )
    static class Empty { //类名随便取, 只是配置定义的一个载体
    }
}