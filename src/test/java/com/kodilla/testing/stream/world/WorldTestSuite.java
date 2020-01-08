package com.kodilla.testing.stream.world;

import com.kodilla.stream.world.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country(CountryName.POLAND, new BigDecimal(38_413_000)));
        europeCountries.add(new Country(CountryName.GERMANY, new BigDecimal(82_979_100)));
        europeCountries.add(new Country(CountryName.ITALY, new BigDecimal(60_375_749)));
        europeCountries.add(new Country(CountryName.FRANCE, new BigDecimal(66_992_000)));
        europeCountries.add(new Country(CountryName.MONACO, new BigDecimal(38_300)));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country(CountryName.CHINA, new BigDecimal(1_400_740_000)));
        asiaCountries.add(new Country(CountryName.INDIA, new BigDecimal(1_356_920_000)));
        asiaCountries.add(new Country(CountryName.PAKISTAN, new BigDecimal(207_240_000)));
        asiaCountries.add(new Country(CountryName.RUSSIA, new BigDecimal(146_793_744)));

        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country(CountryName.NIGERIA, new BigDecimal(200_962_417)));
        africaCountries.add(new Country(CountryName.KENYA, new BigDecimal(52_214_791)));
        africaCountries.add(new Country(CountryName.CONGO, new BigDecimal(86_727_573)));

        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(new Country(CountryName.UNITED_STATES, new BigDecimal(330_529_000)));
        northAmericaCountries.add(new Country(CountryName.CANADA, new BigDecimal(37_754_300)));

        List<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(new Country(CountryName.VENEZUELA, new BigDecimal(32_219_521)));
        southAmericaCountries.add(new Country(CountryName.BRAZIL, new BigDecimal(210_937_000)));

        Continent europe = new Continent(europeCountries, ContinentName.EUROPE);
        Continent asia = new Continent(asiaCountries, ContinentName.ASIA);
        Continent africa = new Continent(africaCountries, ContinentName.AFRICA);
        Continent northAmerica = new Continent(northAmericaCountries, ContinentName.NORTH_AMERICA);
        Continent southAmerica = new Continent(southAmericaCountries, ContinentName.SOUTH_AMERICA);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(africa);
        continents.add(northAmerica);
        continents.add(southAmerica);

        World world = new World("World",continents);
        //when
        Optional<BigDecimal> peopleQuantityWorld = world.getPeopleQuantityWorld();

        //then
        Assert.assertEquals(new BigDecimal(4_311_836_495L), peopleQuantityWorld.get());
    }
}
