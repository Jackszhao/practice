package com.zhao.java_designmodel.FactoryModel.AbstractFactory;

import com.zhao.java_designmodel.FactoryModel.service.animal;

public interface animalFactory {
    animal getLittle();
    animal getBig();
}
