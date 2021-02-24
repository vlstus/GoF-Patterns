package org.study.creational.abstractfactory.product;

public interface ProductA {

    default String doWork() {
        return this.getClass().getSimpleName();
    }
}
