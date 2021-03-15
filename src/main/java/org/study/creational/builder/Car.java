package org.study.creational.builder;

import java.math.BigDecimal;

public class Car {

    String producer;
    String model;
    Boolean isNew;
    BigDecimal price;

    public Car(String producer, String model, boolean isNew, BigDecimal price) {
        this.producer = producer;
        this.model = model;
        this.isNew = isNew;
        this.price = price;
    }

}
