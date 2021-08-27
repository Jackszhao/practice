package com.zhao.java_designmodel.FactoryModel.Factory;

import com.zhao.java_designmodel.FactoryModel.AbstractFactory.animalFactory;
import com.zhao.java_designmodel.FactoryModel.Product.bigCat;
import com.zhao.java_designmodel.FactoryModel.Product.littleCat;
import com.zhao.java_designmodel.FactoryModel.service.animal;

public  class catFactory implements animalFactory {
   @Override
   public animal getLittle(){
       return new littleCat();
   }
    @Override
    public animal getBig(){
        return new bigCat();
    }

}
