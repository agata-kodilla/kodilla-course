package com.kodilla.good.patterns.challenge.food2door.order_item;

import com.kodilla.good.patterns.challenge.food2door.product_item.Product;
import com.kodilla.good.patterns.challenge.food2door.product_item.ProductStore;
import com.kodilla.good.patterns.challenge.food2door.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cart {
    private Map<Product, Integer> productsInCart;
    private User user;

    public Cart(User user) {
        this.user = user;
        productsInCart = new HashMap<>();
    }

    protected void addToProductToCart(Product product, int amount) {
        productsInCart.put(product, amount);
    }

    protected void deleteProductFromCart(Product product, int amount) {
        productsInCart.remove(product);
    }

    public Map<Product, Integer> getProductsInCart() {
        return productsInCart;
    }

    protected double calculateCart() {
        return productsInCart.entrySet().stream()
                .mapToDouble(e -> e.getValue() * e.getKey().getPrice())
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(productsInCart, cart.productsInCart) &&
                Objects.equals(user, cart.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsInCart, user);
    }
}
