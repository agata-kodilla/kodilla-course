package com.kodilla.good.patterns.challenge.service;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Product jeans = new Product("jeans", 129.99);
        Product tshirt = new Product("T-shirt", 39.99);
        Product shoes = new Product("shoes", 299.99);
        Product coat = new Product("coat", 399.99);
        Product sock = new Product("sock", 7.99);

        ProductStorage productStorage = new ProductStorage();
        productStorage.addProducts(jeans, 45);
        productStorage.addProducts(tshirt, 123);
        productStorage.addProducts(shoes, 7);
        productStorage.addProducts(coat, 2);
        productStorage.addProducts(sock, 500);

        Map<Product, Integer> products = productStorage.getProducts();
        System.out.println(products);

        User tom = new User("Tom");

        ChartsManager chartsManager = new ChartsManager(productStorage);

        chartsManager.addProductsToChart(tom, shoes, 5);
        chartsManager.addProductsToChart(tom, sock, 5);

        Order order = chartsManager.createOrder(tom);

        double orderAmount = order.calculateTotal();
        double chartAmount = chartsManager.calculateTotalChart(tom);


        System.out.println("char value: " + chartAmount + ", order value " + orderAmount);
    }
}
