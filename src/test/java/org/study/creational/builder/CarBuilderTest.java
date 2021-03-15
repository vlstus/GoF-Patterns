package org.study.creational.builder;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {

    @Test
    void buildCarTest() {
        Car buildCar = new CarBuilder()
                .producedBy("Audi")
                .ofModel("A4")
                .isNew(false)
                .costs(new BigDecimal("5200.50"))
                .build();
        assertEquals("Audi", buildCar.producer);
        assertEquals("A4", buildCar.model);
        assertFalse(buildCar.isNew);
        assertEquals(new BigDecimal("5200.50"), buildCar.price);
    }

}