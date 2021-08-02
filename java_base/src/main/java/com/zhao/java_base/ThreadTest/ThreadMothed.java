package com.zhao.java_base.ThreadTest;
/*线程让步---yield：可以让正在执行的线程暂停，但是不会进入阻塞状态，而是直接进入就绪状态
线程合并---join：当B线程执行到了A线程的.join（）方法时，B线程就会等待，等A线程都执行完毕，B线程才会执行。*/
public class ThreadMothed {
    public static void main(String[] args) {
        yieldDemo ms = new yieldDemo();
        Thread t1 = new Thread(ms,"张三吃完还剩");
        Thread t2 = new Thread(ms,"李四吃完还剩");
        Thread t3 = new Thread(ms,"王五吃完还剩");
//
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
        System.out.println( "主线程");
    }
}
class yieldDemo implements Runnable{
    int count = 20;
    public void run() {
        while (true) {
            if(count>0){
                System.out.println(Thread.currentThread().getName() + count-- + "个瓜");
                if(count % 2 == 0){
                    Thread.yield();   //线程让步
                }
            }
        }
    }
}
