package com.kodilla.good.patterns.challenge.service;

import com.kodilla.good.patterns.challenge.service.my.*;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Product jeans = new Product("jeans",129.99);
        Product tshirt = new Product("T-shirt",39.99);
        Product shoes = new Product("shoes",299.99);
        Product coat = new Product("coat",399.99);
        Product sock = new Product("sock",7.99);

        ProductStorage productStorage = new ProductStorage();
        productStorage.addProducts(jeans, 45);
        productStorage.addProducts(tshirt,123);
        productStorage.addProducts(shoes,7);
        productStorage.addProducts(coat,2);
        productStorage.addProducts(sock,500);

        Map<Product, Integer> products = productStorage.getProducts();
        System.out.println(products);

        User tom = new User("Tom");

        ChartsManager chartsManager= new ChartsManager();
        chartsManager.getChartByUser(tom);

        Chart tomChart = new Chart(tom);
        tomChart.addProductsToChart(coat,1);
        productStorage.updateProducts(coat,1);
        tomChart.addProductsToChart(sock,7);
        productStorage.updateProducts(sock,7);
        double chartAmount = tomChart.calculateTotal();

        OrderManager orderManager = new OrderManager();
        orderManager.getOrderByUser(tom);

        Order tomOrder = new Order(tom);
        double orderAmount = tomOrder.calculateTotal(tomChart);

        System.out.println("char value: "+chartAmount +", order value "+orderAmount);


    }
}
