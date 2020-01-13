package com.kodilla.exception.test.thirdexercise;

public class Application {
    public static void main(String[] args) {
        Flight flight = new Flight("Tallinn", "Helsinki");
        FindFlight findFlight = new FindFlight();
        findFlight.findFilght(flight);
    }
}
