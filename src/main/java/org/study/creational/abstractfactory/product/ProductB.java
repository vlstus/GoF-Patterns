package org.study.creational.abstractfactory.product;

public interface ProductB {

    default String doWork() {
        return this.getClass().getSimpleName();
    }

}
