package com.zhao.java_designmodel.ObserverModel;
//具体观察者（订阅者）
public class Receive implements AbstractReceive {
    String name;

    public Receive(String name){
        this.name=name;
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name+"收到通知-"+message);
    }
}
