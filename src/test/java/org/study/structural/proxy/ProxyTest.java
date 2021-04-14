package org.study.structural.proxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.study.structural.proxy.proxy.UnitedStatesCitizenshipAndImmigrationServiceCachingProxy;
import org.study.structural.proxy.service.CitizenshipAndImmigrationService;
import org.study.structural.proxy.service.implementation.UnitedStatesCitizenshipAndImmigrationService;

public class ProxyTest {

    private static CitizenshipAndImmigrationService notCached;
    private static CitizenshipAndImmigrationService cached;

    @BeforeAll
    static void initServicesAndWarmCache() {
        notCached = new UnitedStatesCitizenshipAndImmigrationService();
        cached = new UnitedStatesCitizenshipAndImmigrationServiceCachingProxy();
        cached.getPopulation();
    }

    @Test
    void notCachedShouldBeSlower() {
        org.junit.jupiter.api.Assertions.assertTrue(
                estimateExecutionTime(() -> cached.getPopulation())
                        <
                        estimateExecutionTime(() -> notCached.getPopulation()));
    }

    /*
    Improper benchmark but out of the scope of Proxy implementation
    * */
    private long estimateExecutionTime(Runnable task) {
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        return after - before;
    }

}
