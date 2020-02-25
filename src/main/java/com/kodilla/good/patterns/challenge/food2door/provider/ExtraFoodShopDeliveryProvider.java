package com.kodilla.good.patterns.challenge.food2door.provider;

import com.kodilla.good.patterns.challenge.food2door.order_item.Cart;

public class ExtraFoodShopDeliveryProvider implements DeliveryProvider {

    @Override
    public double processOfCalculateDeliver(Cart cart) {
        double extraFoodShopOrder = cart.getProductsInCart().entrySet().stream()
                .filter(e -> e.getKey().getProvider() == DeliveryProviderType.EXTRA_FOOD_SHOOP)
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
        if (extraFoodShopOrder < 50) {
            return 10.99;
        } else {
            return extraFoodShopOrder * 0.05;
        }
    }

    @Override
    public DeliveryProviderType getType() {
        return DeliveryProviderType.EXTRA_FOOD_SHOOP;
    }
}
