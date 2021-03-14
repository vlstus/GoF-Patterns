package org.study.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneTrooperTest {

    @Test
    void genericCloneTest()
            throws CloneNotSupportedException {
        var trooper = new CloneTrooperCommando();
        assertNotSame(trooper, trooper.clone());
    }

    @Test
    void cloneHasSameTypeTest()
            throws CloneNotSupportedException {
        var medic = new CloneTrooperMedic();
        assertTrue(medic.clone() instanceof CloneTrooperMedic);
    }

    @Test
    void clonePropertiesSameTest()
            throws CloneNotSupportedException {
        var commando = new CloneTrooperCommando();
        commando.troopedSpecializationId = 100500;
        commando.trooperSpecialization = "commando";
        var clone = commando.clone();
        assertNotSame(commando, clone);
        assertEquals(CloneTrooperCommando.class, clone.getClass());
        assertEquals(commando.troopedSpecializationId, clone.troopedSpecializationId);
        assertEquals(commando.trooperSpecialization, clone.trooperSpecialization);
    }

}