package com.kodilla.good.patterns.challenge.service;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<User,Order> orderManagerMap;

    public OrderManager() {
        orderManagerMap = new HashMap<>();
    }

    public Order getOrderByUser(User user) {
        if(orderManagerMap.containsKey(user)){
            return orderManagerMap.get(user);
        }
        else {
            Order order =new Order(user);
            orderManagerMap.put(user, order);
            return order;
        }
    }

    public double calculateTotalOrder(User user, Chart chart) {
        return orderManagerMap.get(user).calculateTotal(chart);
    }
}
