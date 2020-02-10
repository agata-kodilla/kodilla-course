package com.kodilla.exception.test.thirdexercise;

import java.util.*;

public class FindFlightRecursion {
    static Map<String, List<String>> airports;
    static Map<Integer, List<String>> routes = new HashMap<>();
    static boolean success = false;
    static int trueCount =0;

    private static boolean findFilght(Flight flight) {

        if (flight.getDepartureAirport().isEmpty() || flight.getDepartureAirport() == null) {
            success = false;
        } else {
            List<String> availableAirports = null;
            availableAirports = airports.get(flight.getDepartureAirport());
            if (availableAirports == null) {
                success = false;
            }
            else if (availableAirports != null) {
                if (!availableAirports.contains(flight.getArrivalAirport())) {
                    for (String ava : availableAirports) {
                        findFilght(new Flight(ava, flight.getArrivalAirport()));
                    }
                } else {
                    success =true;
                    trueCount++;
                }
            }
        }
        if (trueCount > 0) {
            success=true;
        }
        return success;
    }


    public static void main(String[] args) {
        airports = new HashMap<>();
        airports.put("Vienna", new ArrayList<>(Arrays.asList("Minsk", "Brussels", "Tbilisi", "Baku", "Zagreb", "Vienna", "Prague", "Nicosia")));
        airports.put("Baku", new ArrayList<>(Arrays.asList("Dublin", "Rome", "Budapest", "Vienna")));
        airports.put("Minsk", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Rome", "Vienna")));
        airports.put("Brussels", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Vienna")));
        airports.put("Sarajevo", new ArrayList<>(Arrays.asList("Dublin", "Warsaw", "Budapest", "Vienna")));
        airports.put("Sofia", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Vienna")));
        airports.put("Zagreb", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Rome")));
        airports.put("Nicosia", new ArrayList<>(Arrays.asList("Rome", "Berlin", "Reykjavik", "Warsaw")));
        airports.put("Prague", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Vienna")));
        airports.put("Copenhagen", new ArrayList<>(Arrays.asList("Paris", "Berlin", "Tbilisi", "Athens", "Zagreb", "Vienna", "Sofia", "Minsk")));
        airports.put("Tallinn", new ArrayList<>(Arrays.asList("Athens", "Berlin", "Budapest", "Rome")));
        airports.put("Helsinki", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Paris")));
        airports.put("Dublin", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Tbilisi", "Budapest", "Zagreb", "Vienna")));
        airports.put("Rome", new ArrayList<>(Arrays.asList("Dublin", "Berlin")));
        airports.put("Warsaw", new ArrayList<>(Arrays.asList("Berlin", "Dublin", "Rome")));

        boolean filght = findFilght(new Flight("Warsaw", "Tbilisi"));
        System.out.println(filght);
    }
}
