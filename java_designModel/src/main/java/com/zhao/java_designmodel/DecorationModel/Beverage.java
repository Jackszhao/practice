package com.zhao.java_designmodel.DecorationModel;

/**
 * @author zhao
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double getPrice();
}
