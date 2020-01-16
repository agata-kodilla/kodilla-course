package com.kodilla.exception.test.thirdexercise;

import java.util.*;

public class FindFlightRecursion {
    static Map<String, List<String>> airports;
    static Map<Integer, List<String>> routes = new HashMap<>();
    static List<String> routesNetwork = new ArrayList<>();
    static int num = 0;
    static boolean blank = false;
    static List<String>  temp;


    private static void findFilght(Flight flight) {
        if (!blank) {
            temp = new ArrayList<>();
            blank = true;
        }
        List<String> availableAirports = null;
        try {
            availableAirports = airports.get(flight.getDepartureAirport());
            if (availableAirports != null) {
                temp.add(flight.getDepartureAirport());
            }
            if (!availableAirports.contains(flight.getArrivalAirport())) {
                for (String ava : availableAirports) {
                    findFilght(new Flight(ava, flight.getArrivalAirport()));
                }
            } else {
                temp.add(flight.getArrivalAirport());
                routesNetwork.addAll(temp) ;
                routes.put(num, routesNetwork);
                temp.clear();
                num++;
                blank = false;
            }
        } catch (Exception e) {
        }
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
        airports.put("Rome", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Tbilisi")));
        airports.put("Warsaw", new ArrayList<>(Arrays.asList("Berlin", "Dublin", "Rome")));

        findFilght(new Flight("Warsaw", "Tbilisi"));
        routes.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
