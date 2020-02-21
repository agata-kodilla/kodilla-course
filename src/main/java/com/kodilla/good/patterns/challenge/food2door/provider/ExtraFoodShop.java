package com.kodilla.good.patterns.challenge.food2door.provider;

import com.kodilla.good.patterns.challenge.food2door.order_item.Cart;

public class ExtraFoodShop implements ProviderImpl {

    private Cart cart;

    public ExtraFoodShop(Cart cart) {
        this.cart = cart;
    }

    @Override
    public double processOfCalculateDeliver() {
        double extraFoodShopOrder = cart.getProductsInCart().entrySet().stream()
                .filter(e -> e.getKey().getProvider().equalsIgnoreCase(ProviderEnum.EXTRA_FOOD_SHOOP.toString()))
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
        if (extraFoodShopOrder < 50) {
            return 10.99;
        } else {
            return extraFoodShopOrder * 0.05;
        }
    }
}
