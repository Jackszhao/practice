package com.zhao.java_designmodel.SingletonModel;

public class MyTest {
    public static void main(String[] args) {
       SingletonEager eager=SingletonEager.getEager();
       SingletonEager eager1=SingletonEager.getEager();
       System.out.println(eager.hashCode());
       System.out.println(eager1.hashCode());
    }
}
