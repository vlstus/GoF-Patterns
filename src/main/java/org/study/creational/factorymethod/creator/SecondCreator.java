package org.study.creational.factorymethod.creator;

import org.study.creational.factorymethod.product.Product;
import org.study.creational.factorymethod.product.SecondProduct;

public class SecondCreator extends AbstractCreator {

    @Override
    protected Product createProduct() {
        return new SecondProduct();
    }

}
