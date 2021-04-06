package org.study.structural.adapter.provider;

import java.time.LocalDate;

public interface TemperatureObservationsProvider {

    Float getTemperatureAt(LocalDate date);

}
