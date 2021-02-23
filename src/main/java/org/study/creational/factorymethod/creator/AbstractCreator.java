package org.study.creational.factorymethod.creator;

import org.study.creational.factorymethod.product.Product;

public abstract class AbstractCreator {

    protected abstract Product createProduct();

    public String callProduct() {
        return createProduct().produceResult();
    }

}
