package com.zhao.java_designmodel.ObserverModel;

import java.util.ArrayList;
import java.util.List;
//具体的被观察者（消息发布者）
public class Sender implements AbstractSender {
    List<AbstractReceive> list= new ArrayList<>();
    @Override
    public void addObserver(AbstractReceive user) {
        list.add(user);
    }

    @Override
    public void removeObserver(AbstractReceive user) {
        list.remove(user);
    }

    @Override
    public void notify(String message) {
        for (AbstractReceive user:list) {
            user.receive(message);
        }
    }
}
