package org.study.creational.factorymethod.transport;

public class Boat extends AbstractTransport {

    @Override
    public String getTransportIdentifier() {
        return this.getClass().getSimpleName() + " #" + transportNumber;
    }

}
