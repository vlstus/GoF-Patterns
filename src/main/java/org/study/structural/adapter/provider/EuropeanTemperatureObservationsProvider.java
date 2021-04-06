package org.study.structural.adapter.provider;

import org.study.structural.adapter.exception.TemperatureObservationException;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

public class EuropeanTemperatureObservationsProvider
        implements TemperatureObservationsProvider {

    /*
    Mock observations data
    * */
    private final Map<LocalDate, Float> observationsData = Map.ofEntries(
            Map.entry(LocalDate.of(1993, 10, 15), 15.6f),
            Map.entry(LocalDate.of(1993, 10, 16), 16.6f),
            Map.entry(LocalDate.of(1993, 10, 17), 17.6f),
            Map.entry(LocalDate.of(1993, 10, 25), 0.0f)
    );

    /**
     * @param date Date to get temperature for
     * @return Temperature at this date in °C
     * @throws TemperatureObservationException if no data for this date found
     */
    @Override
    public Float getTemperatureAt(LocalDate date) {
        return Optional.ofNullable(observationsData.get(date))
                .orElseThrow(TemperatureObservationException::new);
    }

}
