package com.kodilla.good.patterns.challenge.food2door.product_item;

import java.util.HashMap;
import java.util.Map;

public class ProductStore {
    private Map<Product, Integer> products;

    public ProductStore() {
        products = new HashMap<>();
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void addProductToStore(Product product, int amount) {
        products.put(product, amount);
    }

    public void updateProducts(Product product, int amount) {
        if (amount > products.get(product)) {
            System.out.println("Out of stock");
        } else {
            products.put(product, products.get(product) - amount);
        }
    }

    public void restoreProducts(Product product, int amount) {
        products.put(product, products.get(product) + amount);
    }
}
