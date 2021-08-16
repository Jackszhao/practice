package com.zhao.java_templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class JavaTemplatesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTemplatesApplication.class, args);
    }

}
