package com.zhao.java_designmodel.DecorationModel;

/**
 * 饮料装饰者抽象类
 */
public abstract class BeverageDecorator extends Beverage {

    //所有具体的调料装饰者都必须要实现这个方法，因为我们所要的是一个具体的描述
    public  abstract String getDescription();

}