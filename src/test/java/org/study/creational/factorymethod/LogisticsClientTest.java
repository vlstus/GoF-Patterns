package org.study.creational.factorymethod;

import org.junit.jupiter.api.Test;
import org.study.creational.factorymethod.logistic.BoatLogistics;
import org.study.creational.factorymethod.logistic.TruckLogistics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LogisticsClientTest {

    @Test
    void shouldUseTruckLogistics() {
        String expectedPrefix = "Transporting shipment with Truck #";
        LogisticsClient client = new LogisticsClient();
        client.logistics = new TruckLogistics();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream consoleCapturingStream = new PrintStream(buffer);
        System.setOut(consoleCapturingStream);
        client.orderTransportation();
        assertTrue(buffer.toString().startsWith(expectedPrefix));
    }

    @Test
    void shouldUseBoatLogistics() {
        String expectedPrefix = "Transporting shipment with Boat #";
        LogisticsClient client = new LogisticsClient();
        client.logistics = new BoatLogistics();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream consoleCapturingStream = new PrintStream(buffer);
        System.setOut(consoleCapturingStream);
        client.orderTransportation();
        assertTrue(buffer.toString().startsWith(expectedPrefix));
    }

}