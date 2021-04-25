package org.study.composite;

import org.junit.jupiter.api.Test;
import org.study.structural.composite.Product;
import org.study.structural.composite.products.concrete.Rum;
import org.study.structural.composite.products.concrete.Whiskey;
import org.study.structural.composite.products.containers.Box;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.function.IntFunction;
import java.util.logging.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {

    Logger logger = Logger.getLogger(CompositeTest.class.getName());

    {
        Handler handlerObj = new ConsoleHandler();
        handlerObj.setLevel(Level.ALL);
        logger.addHandler(handlerObj);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
    }

    @Test
    void containerReturnsCorrectPrice() {
        final Box bigBoxOfWhiskey = getLargeBoxOf(Whiskey.class);
        final Box bigBoxOfRum = getLargeBoxOf(Rum.class);

        final var bigBoxOfWhiskeyPrice = bigBoxOfWhiskey.getPrice();
        final var expectedBigBoxOfWhiskeyPrice = getExpectedPriceOfBixBoxOf(Whiskey.class);
        logger.log(Level.ALL,
                String.format("Expected whiskey price %s - actual whiskey price %s",
                        expectedBigBoxOfWhiskeyPrice, bigBoxOfWhiskey.getPrice()));
        assertEquals(expectedBigBoxOfWhiskeyPrice, bigBoxOfWhiskeyPrice);

        final var bigBoxOfRumPrice = bigBoxOfRum.getPrice();
        final var expectedBigBoxOfRumPrice = getExpectedPriceOfBixBoxOf(Rum.class);
        logger.log(Level.ALL,
                String.format("Expected rum price %s - actual rum price %s",
                        expectedBigBoxOfRumPrice, bigBoxOfRum.getPrice()));
        assertEquals(expectedBigBoxOfWhiskeyPrice, bigBoxOfWhiskeyPrice);
    }

    private BigDecimal getExpectedPriceOfBixBoxOf(Class<? extends Product> productType) {
        BigDecimal expected = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                expected = expected.add(instantiateSilently(productType).getPrice());
            }
        }
        return expected;
    }

    private Box getSmallBoxOf(Class<? extends Product> type) {
        return getBoxOf(counter -> instantiateSilently(type));
    }

    private Box getLargeBoxOf(Class<? extends Product> type) {
        return getBoxOf(counter -> getSmallBoxOf(type));
    }

    private <T extends Product> Box getBoxOf(IntFunction<T> mapper) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(mapper)
                .collect(Box::new, Box::add, Box::add);
    }

    private <T extends Product> T instantiateSilently(Class<T> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchMethodException instantiationException) {
            throw new RuntimeException(instantiationException);
        }
    }

}
