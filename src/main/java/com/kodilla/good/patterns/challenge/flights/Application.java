package com.kodilla.good.patterns.challenge.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();
        flightManager.addConnection("Vienna", new ArrayList<>(Arrays.asList("Minsk", "Brussels", "Tbilisi", "Baku", "Zagreb", "Vienna", "Prague", "Nicosia")));
        flightManager.addConnection("Vienna", new ArrayList<>(Arrays.asList("Minsk", "Brussels", "Tbilisi", "Baku", "Zagreb", "Vienna", "Prague", "Nicosia")));
        flightManager.addConnection("Baku", new ArrayList<>(Arrays.asList("Dublin", "Rome", "Budapest", "Vienna")));
        flightManager.addConnection("Minsk", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Rome", "Vienna")));
        flightManager.addConnection("Brussels", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Vienna")));
        flightManager.addConnection("Sarajevo", new ArrayList<>(Arrays.asList("Dublin", "Warsaw", "Budapest", "Vienna")));
        flightManager.addConnection("Sofia", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Vienna")));
        flightManager.addConnection("Zagreb", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Rome")));
        flightManager.addConnection("Nicosia", new ArrayList<>(Arrays.asList("Rome", "Berlin", "Reykjavik", "Warsaw")));
        flightManager.addConnection("Prague", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Budapest", "Vienna")));
        flightManager.addConnection("Copenhagen", new ArrayList<>(Arrays.asList("Paris", "Berlin", "Tbilisi", "Athens", "Zagreb", "Vienna", "Sofia", "Minsk")));
        flightManager.addConnection("Tallinn", new ArrayList<>(Arrays.asList("Athens", "Berlin", "Budapest", "Rome")));
        flightManager.addConnection("Helsinki", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Paris")));
        flightManager.addConnection("Dublin", new ArrayList<>(Arrays.asList("Dublin", "Berlin", "Tbilisi", "Budapest", "Zagreb", "Vienna")));
        flightManager.addConnection("Rome", new ArrayList<>(Arrays.asList("Dublin", "Berlin")));
        flightManager.addConnection("Warsaw", new ArrayList<>(Arrays.asList("Berlin", "Dublin", "Rome")));

        List<String> allArrivals = flightManager.getAllArrivals();
        System.out.println(Arrays.toString(allArrivals.toArray()));
        List<String> allDepartures = flightManager.getAllDepartures();
        System.out.println(Arrays.toString(allDepartures.toArray()));

    }


}
