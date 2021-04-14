package org.study.structural.proxy.service.implementation;

import org.study.structural.proxy.service.CitizenshipAndImmigrationService;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class UnitedStatesCitizenshipAndImmigrationService
        implements CitizenshipAndImmigrationService {

    private final Map<Long, Citizen> citizens;

    private long currentId = 0;

    /*
    Mock data
    * */ {
        citizens = new HashMap<>();
        var pseudoRandomGenerator = new Random();
        var surnamesPool = new String[]{"Black", "White", "Smith"};
        var namesPool = new String[]{"John", "Bill", "Jane"};
        for (int citizenCounter = 0; citizenCounter < 100_000; citizenCounter++) {
            citizens.put(currentId,
                    new Citizen(
                            namesPool[pseudoRandomGenerator.nextInt(namesPool.length)],
                            surnamesPool[pseudoRandomGenerator.nextInt(surnamesPool.length)],
                            (short) pseudoRandomGenerator.nextInt(100),
                            currentId++));
        }
    }

    @Override
    public Citizen getByIdentifier(Long identifier) {
        complicatedServerActivity();
        return Optional.ofNullable(citizens.get(identifier))
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Collection<Citizen> getPopulation() {
        complicatedServerActivity();
        return Collections.unmodifiableCollection(citizens.values());
    }

    private void complicatedServerActivity() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }

}
