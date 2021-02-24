package org.study.creational.abstractfactory.factory.impl;

import org.study.creational.abstractfactory.factory.ProductFactory;
import org.study.creational.abstractfactory.product.ProductA;
import org.study.creational.abstractfactory.product.ProductB;
import org.study.creational.abstractfactory.product.impl.a.SecondProductA;
import org.study.creational.abstractfactory.product.impl.b.SecondProductB;

public class SecondProductProductFactory implements ProductFactory {

    @Override
    public ProductA getProductA() {
        return new SecondProductA();
    }

    @Override
    public ProductB getProductB() {
        return new SecondProductB();
    }

}
