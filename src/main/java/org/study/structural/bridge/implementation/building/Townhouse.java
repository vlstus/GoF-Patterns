package org.study.structural.bridge.implementation.building;

import org.study.structural.bridge.abstraction.building.AbstractBuilding;
import org.study.structural.bridge.abstraction.heating.HeatingSystem;

public class Townhouse extends AbstractBuilding {

    protected Townhouse(HeatingSystem heatingSystem) {
        super(heatingSystem);
    }

    @Override
    public String getHeatingSystemType() {
        return heatingSystem.getType();
    }

}
