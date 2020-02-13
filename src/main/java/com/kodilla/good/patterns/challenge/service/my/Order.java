package com.kodilla.good.patterns.challenge.service.my;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Order {
    @NotNull private Chart chart;
    private double shippingCost = 10.99;

    public Order(User user) {

    }


    public double calculateTotal(Chart chart) {
        return chart.calculateTotal() + shippingCost;
    }
}
