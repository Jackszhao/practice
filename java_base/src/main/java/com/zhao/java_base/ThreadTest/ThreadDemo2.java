package com.zhao.java_base.ThreadTest;

/*线程的第二种实现方式*/
public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread(new CountDown(),"兔子").start();
        new Thread(new CountDown(),"乌龟").start();
    }
}

class CountDown implements Runnable{
    @Override
    public void run() {
        Long time=System.currentTimeMillis();
        int speed=3;
        if ("兔子".equals(Thread.currentThread().getName())){
            speed=12;
        }
        for (int i=0;i<100;i+=speed){
            System.out.println(Thread.currentThread().getName()+":"+i+"米");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        time=(System.currentTimeMillis()-time)/1000;
        System.out.println(Thread.currentThread().getName()+": 已完成，用时"+time+"秒");
    }
}