package com.kodilla.good.patterns.challenge.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightManager {
    private Map<String, List<String>> airports;

    public FlightManager() {
        airports = new HashMap<>();
    }

    public void addConnection(String start, List<String> dests) {
        airports.put(start, dests);
    }

    public List<String> getAllDepartures() {
        List<String> departures = new ArrayList<>();
        airports.entrySet()
                .stream()
                .map(e -> e.getKey())
                .collect(Collectors.toCollection(() -> departures));
        return departures;
    }

    public List<String> getAllArrivals() {
        List<String> arrivals = new ArrayList<>();
        airports.entrySet()
                .stream()
                .flatMap(o -> o.getValue().stream())
                .distinct()
                .collect(Collectors.toCollection(() -> arrivals));
        return arrivals;
    }

    public void findFlisght(String start, String end){
        airports.entrySet()
                .stream()
                .filter(e->e.getKey().equalsIgnoreCase(start))
                .collect(Collectors.toList());
    }

}
