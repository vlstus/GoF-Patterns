package org.study.structural.adapter.client;

import org.study.structural.adapter.provider.TemperatureObservationsProvider;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.stream.Stream;

public class AmericanTemperatureStatisticsService
        implements TemperatureStatisticsService {

    private final TemperatureObservationsProvider observationsProvider;

    public AmericanTemperatureStatisticsService
            (TemperatureObservationsProvider observationsProvider) {
        this.observationsProvider = observationsProvider;
    }

    /**
     * @param startDate Starting date of the period
     * @param endDate   Ending date of the period
     * @return Average temperature in this period in °F
     */
    @Override
    public Float getAverageTemperatureBetween
    (LocalDate startDate, LocalDate endDate) {
        class DateRange implements Iterable<LocalDate> {

            final LocalDate start, end;

            public DateRange(LocalDate start, LocalDate end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public Iterator<LocalDate> iterator() {
                return streamBetweenDate().iterator();
            }

            Stream<LocalDate> streamBetweenDate() {
                return Stream.iterate(start, localDate -> localDate.plusDays(1))
                        .limit(ChronoUnit.DAYS.between(startDate, endDate) + 1);
            }

        }
        float temperatureSum = 0;
        int daysCount = 0;
        for (LocalDate date :
                new DateRange(startDate, endDate)) {
            temperatureSum += observationsProvider.getTemperatureAt(date);
            daysCount++;
        }
        return temperatureSum / daysCount;
    }

}
