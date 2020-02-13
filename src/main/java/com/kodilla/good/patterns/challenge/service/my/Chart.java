package com.kodilla.good.patterns.challenge.service.my;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Chart {

    private Map<Product, Integer> productsInChart;

    public Chart(User user) {
        productsInChart = new HashMap<>();
    }

    public void addProductsToChart(Product product, int amount) {
            productsInChart.put(product, amount);
    }

    public Map<Product, Integer> getProductsFromChart() {
        return productsInChart;
    }

    public double calculateTotal() {
        return productsInChart.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chart chart = (Chart) o;
        return Objects.equals(productsInChart, chart.productsInChart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsInChart);
    }
}
