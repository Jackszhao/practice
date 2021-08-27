package com.zhao.java_designmodel.SingletonModel;
//单例模式之懒汉方式实现
public class SingletonLazy {
    private static SingletonLazy Lazy=null;

    private SingletonLazy(){

    }
    public  SingletonLazy getLazy(){
        synchronized(Lazy){
            if (Lazy==null){
                return new SingletonLazy();
            }else{
                return Lazy;
            }
        }

    }

}
