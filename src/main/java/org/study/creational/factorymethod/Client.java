package org.study.creational.factorymethod;

import org.study.creational.factorymethod.creator.AbstractCreator;
import org.study.creational.factorymethod.creator.FirstCreator;
import org.study.creational.factorymethod.creator.SecondCreator;

public class Client {

    private final AbstractCreator creator;

    public Client(String creatorName) {
        this.creator = initializeCreator(creatorName);
    }

    private AbstractCreator initializeCreator(String creatorName) {
        return switch (creatorName) {
            case "firstCreator" -> new FirstCreator();
            case "secondCreator" -> new SecondCreator();
            default -> throw new IllegalArgumentException("No such creator found");
        };
    }

    public String getProductInvocationResult() {
        return creator.callProduct();
    }
}
