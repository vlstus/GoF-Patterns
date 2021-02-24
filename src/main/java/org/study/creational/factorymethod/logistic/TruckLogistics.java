package org.study.creational.factorymethod.logistic;

import org.study.creational.factorymethod.transport.Truck;
import org.study.creational.factorymethod.transport.Transport;

public class TruckLogistics extends AbstractLogistics {

    @Override
    protected Transport getTransport() {
        return new Truck();
    }

}
