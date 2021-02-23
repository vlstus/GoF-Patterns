package org.study.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import org.study.creational.abstractfactory.product.impl.a.FirstProductA;
import org.study.creational.abstractfactory.product.impl.a.SecondProductA;
import org.study.creational.abstractfactory.product.impl.b.FirstProductB;
import org.study.creational.abstractfactory.product.impl.b.SecondProductB;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryClientTest {

    @Test
    void getFirstProducts() {
        Client client = new Client("firstFactory");
        assertTrue(client.getProductA() instanceof FirstProductA);
        assertTrue(client.getProductB() instanceof FirstProductB);
    }

    @Test
    void getSecondProducts() {
        Client client = new Client("secondFactory");
        assertTrue(client.getProductA() instanceof SecondProductA);
        assertTrue(client.getProductB() instanceof SecondProductB);
    }
}