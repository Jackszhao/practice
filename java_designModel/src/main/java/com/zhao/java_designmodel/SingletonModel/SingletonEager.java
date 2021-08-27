package com.zhao.java_designmodel.SingletonModel;
//单例模式之饿汉方式实现
public class SingletonEager {
    /**
     * 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
     */
    private static SingletonEager eager=new SingletonEager();
    /**
     * private 声明构造
     */
    private SingletonEager(){

    }

    public static SingletonEager getEager(){
        return eager;
    }

    public void print(){
        System.out.println("this is a SingletonEager");
    }
}

