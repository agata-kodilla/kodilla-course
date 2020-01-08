package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class World {
    private String name;
    private List<Continent> continents;

    public World(String name, List<Continent> continents) {
        this.name = name;
        this.continents = continents;
    }

    public Optional<BigDecimal> getPeopleQuantityContinent(ContinentName continent) {
        return continents.stream()
                .filter(c -> c.getName().toString().equalsIgnoreCase(continent.toString()))
                .findFirst()
                .map(Continent::getPeopleQuantityContinent);
    }

    public Optional<BigDecimal> getPeopleQuantityCountry(CountryName country) {
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .filter(c -> c.getName().toString().equalsIgnoreCase(country.toString()))
                .findFirst().map(Country::getPeopleQuantityCountry);
    }

    public Optional<BigDecimal> getPeopleQuantityWorld() {
      return Optional.ofNullable(continents.stream()
              .flatMap(c -> c.getCountries().stream())
              .map(Country::getPeopleQuantityCountry)
              .reduce(BigDecimal.ZERO, BigDecimal::add));
    }
}
