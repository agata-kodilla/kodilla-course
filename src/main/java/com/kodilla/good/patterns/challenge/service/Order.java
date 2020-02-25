package com.kodilla.good.patterns.challenge.service;



public class Order {

    private Chart chart;
    private double shippingCost = 10.99;

    public Order(Chart chart) {
        this.chart = chart;
    }

    public double calculateTotal() {
        return chart.calculateTotal() + shippingCost;
    }
}
