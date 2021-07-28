package com.zhao.java_base.BeanUtilsTest;

import org.springframework.beans.BeanUtils;
/*
    标题：BeanUtils的深拷贝
    日期：2021.07.28
*/
public class DeepCopy {
//当拷贝的对象中不存在对象类型的字段时,BeanUtils进行的是深拷贝（BeanUtils建议使用Spring版的，效率比apache的要高）
    public static void main(String[] args) {
        People jack= new People();
        jack.setName("小明");
        jack.setAddress("西山区");
        jack.setAge(20);
        People tom= new People();
        BeanUtils.copyProperties(jack,tom);
        tom.setAge(24);
        System.out.println("jack:"+jack);
        System.out.println("tom:"+tom);
    }
}
