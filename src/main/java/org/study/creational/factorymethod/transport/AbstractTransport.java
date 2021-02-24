package org.study.creational.factorymethod.transport;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractTransport implements Transport {

    protected int transportNumber = ThreadLocalRandom.current().nextInt();

    @Override
    public String toString() {
        return getTransportIdentifier();
    }
}
