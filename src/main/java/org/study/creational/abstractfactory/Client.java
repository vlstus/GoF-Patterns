package org.study.creational.abstractfactory;

import org.study.creational.abstractfactory.factory.ProductFactory;
import org.study.creational.abstractfactory.factory.impl.FirstProductProductFactory;
import org.study.creational.abstractfactory.factory.impl.SecondProductProductFactory;
import org.study.creational.abstractfactory.product.ProductA;
import org.study.creational.abstractfactory.product.ProductB;

public class Client {

    private ProductFactory factory;

    private ProductA productA;
    private ProductB productB;

    public Client(String productFactoryName) {
        factory = initializeProductFactory(productFactoryName);
        this.productA = factory.getProductA();
        this.productB = factory.getProductB();
    }

    private ProductFactory initializeProductFactory(String productFactoryName) {
        return switch (productFactoryName) {
            case "firstFactory" -> new FirstProductProductFactory();
            case "secondFactory" -> new SecondProductProductFactory();
            default -> throw new IllegalArgumentException("No such factory found");
        };
    }

    public ProductA getProductA() {
        return productA;
    }

    public ProductB getProductB() {
        return productB;
    }
}
