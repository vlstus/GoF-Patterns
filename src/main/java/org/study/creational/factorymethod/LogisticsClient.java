package org.study.creational.factorymethod;


import org.study.creational.factorymethod.logistic.Logistics;

public class LogisticsClient {

    /*
    Will be provided with dependency injection
    * */
    Logistics logistics;

    public void orderTransportation() {
        logistics.transport();
    }

}
