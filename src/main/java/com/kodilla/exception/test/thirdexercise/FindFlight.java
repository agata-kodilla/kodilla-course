package com.kodilla.exception.test.thirdexercise;

import com.kodilla.exception.test.ExceptionHandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFlight {

    public void findFilght(Flight flight) {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Tirana", true);
        airports.put("Yerevan", true);
        airports.put("Vienna", false);
        airports.put("Baku", true);
        airports.put("Minsk", true);
        airports.put("Brussels", true);
        airports.put("Sarajevo", true);
        airports.put("Sofia", true);
        airports.put("Zagreb", true);
        airports.put("Nicosia", true);
        airports.put("Prague", true);
        airports.put("Copenhagen", true);
        airports.put("Tallinn", false);
        airports.put("Helsinki", true);
        airports.put("Paris", true);
        airports.put("Tbilisi", false);
        airports.put("Berlin", true);
        airports.put("Athens", false);
        airports.put("Budapest", true);
        airports.put("Reykjavik", true);
        airports.put("Dublin", false);
        airports.put("Rome", true);
        airports.put("Warsaw", true);

        List<String> keys = new ArrayList<>(airports.keySet());
        try {
            keys.stream().filter(e -> e.equalsIgnoreCase(flight.getArrivalAirport())).findFirst().get();
            keys.stream().filter(e -> e.equalsIgnoreCase(flight.getDepartureAirport())).findFirst().get();
            Boolean arrivalBool = airports.get(flight.getArrivalAirport());
            Boolean departureBool = airports.get(flight.getDepartureAirport());
            if (!arrivalBool || !departureBool) {
                throw new RouteNotFoundException("Route does not exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
