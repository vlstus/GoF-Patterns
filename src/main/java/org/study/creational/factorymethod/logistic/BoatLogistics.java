package org.study.creational.factorymethod.logistic;

import org.study.creational.factorymethod.transport.Transport;
import org.study.creational.factorymethod.transport.Boat;

public class BoatLogistics extends AbstractLogistics {

    @Override
    protected Transport getTransport() {
        return new Boat();
    }

}
