package com.zhao.java_designmodel.DecorationModel;

/**
 * @author zhao
 */ //饮品抽象的实现，深焙咖啡
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "深焙咖啡";
    }

    @Override
    public double getPrice() {
        return 20;  //我们假设这杯饮品值20块钱
    }
}