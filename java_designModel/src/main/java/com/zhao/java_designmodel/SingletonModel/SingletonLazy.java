package com.zhao.java_designmodel.SingletonModel;

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
