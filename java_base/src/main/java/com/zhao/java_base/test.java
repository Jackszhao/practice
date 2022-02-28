package com.zhao.java_base;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            int length=input.length();
            int n=0;
            int result=0;
            for (int i=0;i<length-1;i++){
               if(input.charAt(i)<'a'){
                   n+=1;
               }else{
                   result=Math.max(n,result);
                   n=0;
               }
            }
            System.out.println(result+1);
        }
    }
}
