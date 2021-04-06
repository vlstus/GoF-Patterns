package org.study.structural.adapter.provider.adapter;

import org.study.structural.adapter.provider.EuropeanTemperatureObservationsProvider;
import org.study.structural.adapter.provider.TemperatureObservationsProvider;

import java.time.LocalDate;

public class EuropeanToAmericanTemperatureObservationProviderAdapter
        implements TemperatureObservationsProvider {

    //Works with °C
    private final EuropeanTemperatureObservationsProvider europeanTemperatureObservationsProvider;

    public EuropeanToAmericanTemperatureObservationProviderAdapter
            (EuropeanTemperatureObservationsProvider europeanTemperatureObservationsProvider) {
        this.europeanTemperatureObservationsProvider = europeanTemperatureObservationsProvider;
    }

    /**
     * @return data from aggregated provider converted to °F
     */
    @Override
    public Float getTemperatureAt(LocalDate date) {
        return (europeanTemperatureObservationsProvider.getTemperatureAt(date) * 1.8f) + 32;
    }

}
