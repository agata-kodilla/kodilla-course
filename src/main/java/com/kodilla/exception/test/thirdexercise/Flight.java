package com.kodilla.exception.test.thirdexercise;

import org.jetbrains.annotations.NotNull;

public class Flight {

    @NotNull private String departureAirport;
    @NotNull private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
