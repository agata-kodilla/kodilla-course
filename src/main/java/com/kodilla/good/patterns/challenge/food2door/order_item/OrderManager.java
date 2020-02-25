package com.kodilla.good.patterns.challenge.food2door.order_item;

import com.kodilla.good.patterns.challenge.food2door.provider.DeliveryProvider;
import com.kodilla.good.patterns.challenge.food2door.provider.DeliveryProviderType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    private Map<DeliveryProviderType, DeliveryProvider> deliveryProviders = new HashMap<>();

    public OrderManager(List<DeliveryProvider> deliveryProviders) {
        for (DeliveryProvider deliveryProvider : deliveryProviders) {
            this.deliveryProviders.put(deliveryProvider.getType(), deliveryProvider);
        }
    }

    public double calculateDeliveryCost(Order order) {
        return order.getRequiredDeliveryProviders().stream()
                .map(deliveryProviderType -> deliveryProviders.get(deliveryProviderType))
                .mapToDouble(deliveryProvider -> deliveryProvider.processOfCalculateDeliver(order.getCart()))
                .sum();
    }


}
