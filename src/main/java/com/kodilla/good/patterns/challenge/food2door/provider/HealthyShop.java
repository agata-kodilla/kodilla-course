package com.kodilla.good.patterns.challenge.food2door.provider;

import com.kodilla.good.patterns.challenge.food2door.order_item.Cart;

public class HealthyShop implements ProviderImpl {

    private Cart cart;

    public HealthyShop(Cart cart) {
        this.cart = cart;
    }

    @Override
    public double processOfCalculateDeliver() {
        double healthyShop = cart.getProductsInCart().entrySet().stream()
                .filter(e -> e.getKey().getProvider().equalsIgnoreCase(ProviderEnum.HEALTHY_SHOP.toString()))
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
        if (healthyShop > 250) {
            return  0;
        } else {
            return 11.99;
        }
    }
}
