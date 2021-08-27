package com.zhao.java_designmodel.FactoryModel.Product;

import com.zhao.java_designmodel.FactoryModel.AbstractProduct.dog;

public class bigDog extends dog {
   @Override
    public void saying(){
       System.out.println("一只大金毛");
   }
}
