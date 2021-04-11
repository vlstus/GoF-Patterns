package org.study.structural.bridge.implementation.heating;

import org.study.structural.bridge.abstraction.heating.HeatingSystem;

public class Furnace
        implements HeatingSystem {

    @Override
    public String getType() {
        return this.getClass().getTypeName();
    }

}
