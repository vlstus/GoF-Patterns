package org.study.creational.factorymethod.transport;

public class Truck extends AbstractTransport {

    @Override
    public String getTransportIdentifier() {
        return this.getClass().getSimpleName() + " #" + transportNumber;
    }

}
