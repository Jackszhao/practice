package com.zhao.java_base.ThreadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws  InterruptedException, ExecutionException {
      CallableDemo cd= new CallableDemo();
      FutureTask ft= new FutureTask(cd);
      new Thread(ft).start();
      List<Integer> result= (List<Integer>) ft.get();
        for (Integer i:  result) {
            System.out.println(i);
        }
    }
}
class CallableDemo implements Callable<List<Integer>> {

    @Override
    public List<Integer> call() throws Exception {
        boolean flag = false;
        List<Integer> lists = new ArrayList<>();
        for(int i  = 3 ; i < 100 ; i ++) {
            flag = false;
            for(int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                lists.add(i);
            }
        }
        return lists;
    }

}
