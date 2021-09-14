package com.zhao.java_designmodel.DecorationModel;

public class Whip extends BeverageDecorator {

    //通过组合的方式引入我们具体要被装饰的饮品
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() + "，加奶泡";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 5; //那么这杯被装饰的饮品的价格就是我们原来饮品的价格加上我们的调料
    }
}