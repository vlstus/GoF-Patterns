package org.study.creational.factorymethod.product;

public interface Product {

    default String produceResult() {
        return "I am " + this.getClass().getSimpleName();
    }

}
