package com.zhao.java_designmodel.ObserverModel;
//抽象的被观察者（消息发布者）
public interface AbstractSender {
    void addObserver(AbstractReceive user);
    void removeObserver(AbstractReceive user);
    void notify(String message);
}
