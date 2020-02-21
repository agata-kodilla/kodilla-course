package com.kodilla.good.patterns.challenge.food2door.order_item;

import com.kodilla.good.patterns.challenge.food2door.User;
import com.kodilla.good.patterns.challenge.food2door.provider.ExtraFoodShop;
import com.kodilla.good.patterns.challenge.food2door.provider.HealthyShop;
import com.kodilla.good.patterns.challenge.food2door.provider.ProviderImpl;
import org.jetbrains.annotations.NotNull;


public class Order {
    @NotNull
    private Cart cart;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public double calculateOrder() {
        ProviderImpl extraFoodShop = new ExtraFoodShop(cart);
        ProviderImpl healthyShop = new HealthyShop(cart);
        return cart.calculateCart()+extraFoodShop.processOfCalculateDeliver()+healthyShop.processOfCalculateDeliver();
    }
}
