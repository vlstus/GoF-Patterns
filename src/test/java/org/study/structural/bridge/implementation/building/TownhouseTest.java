package org.study.structural.bridge.implementation.building;

import org.junit.jupiter.api.Test;
import org.study.structural.bridge.implementation.heating.Boiler;
import org.study.structural.bridge.implementation.heating.Furnace;

import static org.junit.jupiter.api.Assertions.*;

class TownhouseTest {

    @Test
    void getHeatingSystemTypeForBoiler() {
        var buildingWithBoiler = new Townhouse(new Boiler());
        assertEquals("org.study.structural.bridge.implementation.heating.Boiler",
                buildingWithBoiler.getHeatingSystemType());
    }

    @Test
    void getHeatingSystemTypeForFurnace() {
        var buildingWithFurnace = new Townhouse(new Furnace());
        assertEquals("org.study.structural.bridge.implementation.heating.Furnace",
                buildingWithFurnace.getHeatingSystemType());
    }

}