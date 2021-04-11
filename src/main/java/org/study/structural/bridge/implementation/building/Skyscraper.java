package org.study.structural.bridge.implementation.building;

import org.study.structural.bridge.abstraction.building.AbstractBuilding;
import org.study.structural.bridge.abstraction.heating.HeatingSystem;

public class Skyscraper
        extends AbstractBuilding {

    protected Skyscraper(HeatingSystem heatingSystem) {
        super(heatingSystem);
    }

    @Override
    public String getHeatingSystemType() {
        return heatingSystem.getType();
    }

}
