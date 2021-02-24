package org.study.creational.abstractfactory;

import org.study.creational.abstractfactory.factory.FurnitureFactory;

public class FurnitureFactoryClient {

    FurnitureFactory factory;

    public void useChair() {
        System.out.println("Using chair " + factory.getChair());
    }

    public void useSofa() {
        System.out.println("Using sofa " + factory.getSofa());
    }

    public void useTable() {
        System.out.println("Using table " + factory.getTable());
    }

}
