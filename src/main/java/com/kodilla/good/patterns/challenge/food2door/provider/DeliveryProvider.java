package com.kodilla.good.patterns.challenge.food2door.provider;

import com.kodilla.good.patterns.challenge.food2door.order_item.Cart;

public interface DeliveryProvider {

    double processOfCalculateDeliver(Cart cart);

    DeliveryProviderType getType();
}
