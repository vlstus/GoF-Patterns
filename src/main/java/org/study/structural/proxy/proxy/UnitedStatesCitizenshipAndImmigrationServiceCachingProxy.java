package org.study.structural.proxy.proxy;

import org.study.structural.proxy.service.CitizenshipAndImmigrationService;
import org.study.structural.proxy.service.implementation.UnitedStatesCitizenshipAndImmigrationService;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UnitedStatesCitizenshipAndImmigrationServiceCachingProxy
        implements CitizenshipAndImmigrationService {

    private final CitizenshipAndImmigrationService immigrationService =
            new UnitedStatesCitizenshipAndImmigrationService();

    Map<Long, Citizen> cache = new HashMap<>();

    @Override
    public Citizen getByIdentifier(Long identifier) {
        if (cache.containsKey(identifier)) {
            return cache.get(identifier);
        } else {
            return immigrationService.getByIdentifier(identifier);
        }
    }

    @Override
    public Collection<Citizen> getPopulation() {
        if (cache.isEmpty()) {
            cache = immigrationService.getPopulation().stream()
                    .collect(Collectors.toMap(Citizen::identifier, Function.identity()));
        }
        return Collections.unmodifiableCollection(cache.values());
    }

}
