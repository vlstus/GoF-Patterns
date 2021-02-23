package org.study.creational.factorymethod.creator;

import org.study.creational.factorymethod.product.FirstProduct;
import org.study.creational.factorymethod.product.Product;

public class FirstCreator extends AbstractCreator {

    @Override
    protected Product createProduct() {
        return new FirstProduct();
    }

}
