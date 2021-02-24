package org.study.creational.abstractfactory.factory.impl;

import org.study.creational.abstractfactory.factory.ProductFactory;
import org.study.creational.abstractfactory.product.ProductA;
import org.study.creational.abstractfactory.product.ProductB;
import org.study.creational.abstractfactory.product.impl.a.FirstProductA;
import org.study.creational.abstractfactory.product.impl.b.FirstProductB;

public class FirstProductProductFactory implements ProductFactory {

    @Override
    public ProductA getProductA() {
        return new FirstProductA();
    }

    @Override
    public ProductB getProductB() {
        return new FirstProductB();
    }

}
