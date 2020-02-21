package com.kodilla.good.patterns.challenge.food2door.product_item;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String provider;

    public Product(String name, double price, String provider) {
        this.name = name;
        this.price = price;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(provider, product.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, provider);
    }
}
