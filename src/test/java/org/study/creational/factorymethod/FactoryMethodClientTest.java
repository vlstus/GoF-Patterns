package org.study.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodClientTest {

    @Test
    void getProductInvocationResultForFirstCreator() {
        Client client = new Client("firstCreator");
        String productInvocationResult = client.getProductInvocationResult();
        assertEquals("I am FirstProduct", productInvocationResult);
    }

    @Test
    void getProductInvocationResultForSecondCreator() {
        Client client = new Client("secondCreator");
        String productInvocationResult = client.getProductInvocationResult();
        assertEquals("I am SecondProduct", productInvocationResult);
    }
}