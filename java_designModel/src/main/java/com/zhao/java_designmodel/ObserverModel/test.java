package com.zhao.java_designmodel.ObserverModel;

public class test {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receive u1 = new Receive("张三");
        Receive u2 = new Receive("李四");
        sender.addObserver(u1);
        sender.addObserver(u2);
        sender.notify("观察者设计模式初探");

    }
}
