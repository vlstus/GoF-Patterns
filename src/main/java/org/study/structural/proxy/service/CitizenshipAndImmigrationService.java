package org.study.structural.proxy.service;

import java.util.Collection;
import java.util.Objects;

public interface CitizenshipAndImmigrationService {

    record Citizen(String firstName, String lastName, Short age, Long identifier) {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Citizen citizen = (Citizen) o;
            return identifier.equals(citizen.identifier);
        }

        @Override
        public int hashCode() {
            return Objects.hash(identifier);
        }

    }

    Citizen getByIdentifier(Long identifier);

    Collection<Citizen> getPopulation();

}
