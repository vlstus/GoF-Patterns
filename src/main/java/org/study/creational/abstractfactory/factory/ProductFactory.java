package org.study.creational.abstractfactory.factory;

import org.study.creational.abstractfactory.product.ProductA;
import org.study.creational.abstractfactory.product.ProductB;

public interface ProductFactory {

    ProductA getProductA();

    ProductB getProductB();

}
