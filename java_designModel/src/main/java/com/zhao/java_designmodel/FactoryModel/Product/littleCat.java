package com.zhao.java_designmodel.FactoryModel.Product;

import com.zhao.java_designmodel.FactoryModel.AbstractProduct.cat;

public class littleCat extends cat {
    @Override
    public void saying(){
        System.out.println("一只小茶杯猫");
    }
}
