package org.study.structural.bridge.abstraction.building;

import org.study.structural.bridge.abstraction.heating.HeatingSystem;

public abstract class AbstractBuilding
        implements Building {

    protected final HeatingSystem heatingSystem;

    protected AbstractBuilding(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

}
