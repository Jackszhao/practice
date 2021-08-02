package com.zhao.java_base.ThreadTest;
/*线程的第一种实现方式*/
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        try {
            pao();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void pao() throws InterruptedException{
        Long time=System.currentTimeMillis();
        int speed=3;
        if ("兔子".equals(this.getName())){
            speed=12;
        }
        for (int i=0;i<100;i+=speed){
            System.out.println(this.getName()+":"+i+"米");
            Thread.sleep(1000);
        }
        time=(System.currentTimeMillis()-time)/1000;
        System.out.println(Thread.currentThread().getName()+": 已完成，用时"+time+"秒");
    }
}
