package com.zhao.java_base.BeanUtilsTest;

import org.springframework.beans.BeanUtils;
/*
    标题：BeanUtils的浅拷贝和对象直接赋值
    日期：2021.07.28
*/
public class ShallowCopy {
    //当拷贝的对象中存在对象类型的字段时,BeanUtils进行的是浅拷贝（BeanUtils建议使用Spring版的，效率比apache的要高）
    //直接赋值法也属于浅拷贝
    public static void main(String[] args) {
        //编辑People信息
        People jack= new People();
        jack.setName("小明");
        jack.setAddress("西山区");
        jack.setAge(20);
        //编辑User信息
        User user=new User();
        user.setName("小李子");
        user.setAge(30);
        //将People信息放入User中
        user.setPeople(jack);
        //new 第二个User
        User user1= new User();
        //进行拷贝
        BeanUtils.copyProperties(user,user1);
        user1.getPeople().setName("小张");
        //打印信息并验证结果
        System.out.println("user:"+user);
        System.out.println("user1:"+user1);
        //直接赋值法
        user1=user;
        user1.getPeople().setName("小赵");
        System.out.println("user:"+user);
        System.out.println("user1:"+user1);

    }
}
