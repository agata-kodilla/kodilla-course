package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class Continent {

    private List<Country> countries;
    private ContinentName name;

    public Continent(List<Country> countries, ContinentName name) {
        this.countries = countries;
        this.name = name;
    }

    public ContinentName getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public BigDecimal getPeopleQuantityContinent() {
        return countries.stream()
                .map(c -> c.getPeopleQuantityCountry())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
