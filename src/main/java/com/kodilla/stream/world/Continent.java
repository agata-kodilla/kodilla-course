package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

   private List<Country> countryList;
   private String name;

    public Continent(String name) {
        this.name = name;
    }

    public static List<Country> getCountryList() {
        final List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Poland",new BigDecimal(38413000)));
        countryList.add(new Country("China",new BigDecimal(1400740000)));
        countryList.add(new Country("United States",new BigDecimal(330529000)));
        countryList.add(new Country("Russia",new BigDecimal(146793744)));
        countryList.add(new Country("Germany",new BigDecimal(82979100)));
        countryList.add(new Country("Italy",new BigDecimal(60375749)));
        countryList.add(new Country("Brasil",new BigDecimal(210924000)));
        countryList.add(new Country("Tanzania",new BigDecimal(55890747)));
        countryList.add(new Country("Kenya",new BigDecimal(52214791)));
        countryList.add(new Country("Argentina",new BigDecimal(44938712)));
        return new ArrayList<Country>(countryList);
    }
}
