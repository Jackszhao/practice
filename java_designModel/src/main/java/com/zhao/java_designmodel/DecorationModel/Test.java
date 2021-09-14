package com.zhao.java_designmodel.DecorationModel;

public class Test {
    public static void main(String[] args) {
        //先做一杯深焙咖啡出来
        Beverage darkRoast = new DarkRoast();
        //对我们的咖啡添加摩卡
        darkRoast = new Mocha(darkRoast);
        //对我们的咖啡添加奶泡
        darkRoast = new Whip(darkRoast);
        //输出我们的饮品名字和价钱
        System.out.println("我们的饮品名字是："+ darkRoast.getDescription());
        System.out.println("我们的饮品价格是："+ darkRoast.getPrice());
    }
}
