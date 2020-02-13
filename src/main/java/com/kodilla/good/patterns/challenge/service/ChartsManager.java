package com.kodilla.good.patterns.challenge.service;

import java.util.HashMap;
import java.util.Map;

public class ChartsManager {
    private Map<User, Chart> chartManagerMap;

    public ChartsManager() {
        chartManagerMap = new HashMap<>();
    }

    public Map<User, Chart> getChartManagerMap() {
        return chartManagerMap;
    }

    public Chart getChartByUser(User user) {
        if(chartManagerMap.containsKey(user)){
            return chartManagerMap.get(user);
        }
        else {
            Chart chart =new Chart(user);
            chartManagerMap.put(user, chart);
            return chart;
        }
    }

    public double calculateTotalChart(User user) {
        return chartManagerMap.get(user).calculateTotal();
    }
}
