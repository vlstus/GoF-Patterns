package org.study.structural.adapter.provider.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.study.structural.adapter.provider.EuropeanTemperatureObservationsProvider;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EuropeanToAmericanTemperatureObservationProviderAdapterTest {

    EuropeanToAmericanTemperatureObservationProviderAdapter adapter;

    @BeforeEach
    void setUpAdapter() {
        adapter =
                new EuropeanToAmericanTemperatureObservationProviderAdapter
                        (new EuropeanTemperatureObservationsProvider());
    }

    @Test
    void getTemperatureAt() {
        var dateWithZeroInCelsius = LocalDate.of(1993, 10, 25);
        Float adapterTemperatureAt = adapter.getTemperatureAt(dateWithZeroInCelsius);
        assertEquals(32.0f, adapterTemperatureAt.floatValue());
    }

}