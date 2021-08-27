package com.zhao.java_designmodel.FactoryModel.Factory;

import com.zhao.java_designmodel.FactoryModel.AbstractFactory.animalFactory;
import com.zhao.java_designmodel.FactoryModel.Product.bigDog;
import com.zhao.java_designmodel.FactoryModel.Product.littleDog;
import com.zhao.java_designmodel.FactoryModel.service.animal;

public class dogFactory implements animalFactory {
    @Override
    public animal getLittle() {
        return new littleDog();
    }

    @Override
    public animal getBig() {
        return new bigDog();
    }
}
