package org.study.creational.builder;

import java.math.BigDecimal;

public class CarBuilder {

    private String producer;
    private String model;
    private boolean isNew;
    private BigDecimal price;

    public CarBuilder producedBy(String producer) {
        this.producer = producer;
        return this;
    }

    public CarBuilder ofModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder costs(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CarBuilder isNew(boolean isNew) {
        this.isNew = isNew;
        return this;
    }

    public Car build() {
        return new Car(producer, model, isNew, price);
    }

}
