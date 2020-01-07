package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {
    private List<Continent> continentList;

    public static List<Continent> getContinentList() {
        final List<Continent> continetList = new ArrayList<>();
        continetList.add(new Continent("Europe"));
        continetList.add(new Continent("Asia"));
        continetList.add(new Continent("North America"));
        continetList.add(new Continent("South America"));
        continetList.add(new Continent("Africa"));
        return new ArrayList<Continent>(continetList);
    }


    public Map<Continent, Country> getContinentMap() {
        final Map<Continent,Country> continetMap = new HashMap<>();
    continetMap.put(new Continent("Europe"), new Country("Poland",new BigDecimal(38413000)));
        return new HashMap<>(continetMap);
    }

    public BigDecimal getPeopleQuantity(){
        return null;
    }
}
