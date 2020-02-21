package com.kodilla.good.patterns.challenge.food2door.provider;

import com.kodilla.good.patterns.challenge.food2door.order_item.Cart;

public class HealthyShopDeliveryProvider implements DeliveryProvider {

    @Override
    public double processOfCalculateDeliver(Cart cart) {
        double healthyShop = cart.getProductsInCart().entrySet().stream()
                .filter(e -> e.getKey().getProvider() == DeliveryProviderType.HEALTHY_SHOP)
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
        if (healthyShop > 250) {
            return 0;
        } else {
            return 11.99;
        }
    }

    @Override
    public DeliveryProviderType getType() {
        return DeliveryProviderType.HEALTHY_SHOP;

    }
}
