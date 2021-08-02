package com.zhao.java_base.ThreadTest;

public class ThreadMain1 {
    public static void main(String[] args) {
        Thread turtle = new ThreadDemo1();
        Thread rabbit = new ThreadDemo1();
        turtle.setName("乌龟");
        rabbit.setName("兔子");
        turtle.start();
        rabbit.start();
        if (!rabbit.isAlive()){
            turtle.stop();
            rabbit.stop();
        }

    }
}
