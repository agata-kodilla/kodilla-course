package com.kodilla.good.patterns.challenge.service;

import org.jetbrains.annotations.NotNull;

public class Order {
    @NotNull
    private Chart chart;
    private double shippingCost = 10.99;

    public Order(Chart chart) {
        this.chart = chart;
    }

    public double calculateTotal() {
        return chart.calculateTotal() + shippingCost;
    }
}
