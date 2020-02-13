package com.kodilla.good.patterns.challenge.service;

import java.util.HashMap;
import java.util.Map;

public class ProductStorage {

    private Map<Product, Integer> products;

    public ProductStorage() {
        products = new HashMap<>();
    }

    public void addProducts(Product product, int amount) {
        products.put(product, amount);
    }

    public void removeProducts(Product product) {
        products.remove(product);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void updateProducts(Product product, int amount) {
        if(amount>products.get(product)){
            System.out.println("Out of stock");
        }
        else {
            products.put(product, products.get(product) - amount);
        }
    }

}
