package com.zhao.java_templates.Forest;

import com.dtflys.forest.annotation.Request;

public interface MyClient {
    @Request(url = "http://localhost:8080/hello")
    String helloForest();
}
