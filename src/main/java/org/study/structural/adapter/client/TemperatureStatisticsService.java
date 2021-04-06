package org.study.structural.adapter.client;

import java.time.LocalDate;

public interface TemperatureStatisticsService {

    Float getAverageTemperatureBetween(LocalDate startDate,LocalDate endDate);

}
