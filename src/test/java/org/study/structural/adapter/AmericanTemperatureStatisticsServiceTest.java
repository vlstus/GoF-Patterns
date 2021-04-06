package org.study.structural.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.study.structural.adapter.client.AmericanTemperatureStatisticsService;
import org.study.structural.adapter.client.TemperatureStatisticsService;
import org.study.structural.adapter.provider.EuropeanTemperatureObservationsProvider;
import org.study.structural.adapter.provider.adapter.EuropeanToAmericanTemperatureObservationProviderAdapter;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmericanTemperatureStatisticsServiceTest {

    TemperatureStatisticsService service;

    @BeforeEach
    void setUp() {
        service =
                new AmericanTemperatureStatisticsService
                        (new EuropeanToAmericanTemperatureObservationProviderAdapter
                                (new EuropeanTemperatureObservationsProvider()));
    }

    @Test
    /*
    Possible float point numbers calculation problems. But out of the scope of task to implement design pattern
    * */
    void getAverageTemperatureBetween() {
        var start = LocalDate.of(1993, 10, 15);
        var end = LocalDate.of(1993, 10, 17);
        Float averageTemperatureBetween = service.getAverageTemperatureBetween(start, end);
        float expected = 61.88f;
        assertEquals(expected, averageTemperatureBetween.floatValue());
    }

}