package com.zhao.java_designmodel.FactoryModel.Product;

import com.zhao.java_designmodel.FactoryModel.AbstractProduct.cat;

public class bigCat extends cat {
    @Override
    public void saying(){
        System.out.println("一只大橘猫");
    }
}
