package com.zhao.java_designmodel.FactoryModel.Product;

import com.zhao.java_designmodel.FactoryModel.AbstractProduct.dog;

public class littleDog extends dog {
    @Override
    public void saying(){
        System.out.println("一只小泰迪");
    }
}
