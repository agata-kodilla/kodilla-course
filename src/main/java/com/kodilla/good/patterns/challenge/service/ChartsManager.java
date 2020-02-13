package com.kodilla.good.patterns.challenge.service;

import java.util.HashMap;
import java.util.Map;

public class ChartsManager {
    private Map<User, Chart> chartManagerMap;
    private ProductStorage productStorage;

    public ChartsManager(ProductStorage productStorage) {
        chartManagerMap = new HashMap<>();
        this.productStorage = productStorage;
    }

    public Map<User, Chart> getChartManagerMap() {
        return chartManagerMap;
    }

    private Chart getChartByUser(User user) {
        if (chartManagerMap.containsKey(user)) {
            return chartManagerMap.get(user);
        } else {
            Chart chart = new Chart(user);
            chartManagerMap.put(user, chart);
            return chart;
        }
    }

    public double calculateTotalChart(User user) {
        return chartManagerMap.get(user).calculateTotal();
    }

    public void addProductsToChart(User user, Product product, int amount) {
        getChartByUser(user).addProductsToChart(product, amount);
        productStorage.updateProducts(product, amount);
    }

    public Order createOrder(User user){
       return new Order(getChartByUser(user));
    }

}
