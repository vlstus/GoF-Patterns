package org.study.creational.factorymethod.logistic;

import org.study.creational.factorymethod.transport.Transport;

public abstract class AbstractLogistics implements Logistics {

    protected abstract Transport getTransport();

    public void transport() {
        System.out.println("Transporting shipment with " + getTransport());
    }

}
