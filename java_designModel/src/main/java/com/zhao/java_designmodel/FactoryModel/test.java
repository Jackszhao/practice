package com.zhao.java_designmodel.FactoryModel;

import com.zhao.java_designmodel.FactoryModel.AbstractFactory.animalFactory;
import com.zhao.java_designmodel.FactoryModel.Factory.catFactory;
import com.zhao.java_designmodel.FactoryModel.Factory.dogFactory;
import com.zhao.java_designmodel.FactoryModel.service.animal;

public class test {
    public static void main(String[] args) {
        animalFactory cat = new catFactory();
        animal big = cat.getBig();
        big.saying();

        animalFactory dog = new dogFactory();
        animal little=dog.getLittle();
        little.saying();

    }
}
