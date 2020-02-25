package com.kodilla.good.patterns.challenge.food2door.order_item;

import com.kodilla.good.patterns.challenge.food2door.product_item.Product;
import com.kodilla.good.patterns.challenge.food2door.provider.DeliveryProviderType;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Order {

    private Cart cart;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public double calculateOrder() {
        return cart.calculateCart();
    }

    public Set<DeliveryProviderType> getRequiredDeliveryProviders() {
        return cart.getProductsInCart().keySet().stream()
                .map(Product::getProvider)
                .collect(toSet());
    }

    public Cart getCart() {
        return cart;
    }
}
