package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private CountryName name;
    private BigDecimal peopleAmount;

    public Country(CountryName name, BigDecimal peopleAmount) {
        this.name = name;
        this.peopleAmount = peopleAmount;
    }

    public CountryName getName() {
        return name;
    }

    public BigDecimal getPeopleQuantityCountry() {
        return peopleAmount;
    }
}
