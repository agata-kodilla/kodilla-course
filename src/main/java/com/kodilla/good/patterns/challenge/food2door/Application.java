package com.kodilla.good.patterns.challenge.food2door;

import com.kodilla.good.patterns.challenge.food2door.order_item.CartManager;
import com.kodilla.good.patterns.challenge.food2door.order_item.Order;
import com.kodilla.good.patterns.challenge.food2door.order_item.OrderManager;
import com.kodilla.good.patterns.challenge.food2door.product_item.Product;
import com.kodilla.good.patterns.challenge.food2door.product_item.ProductStore;
import com.kodilla.good.patterns.challenge.food2door.provider.DeliveryProviderType;
import com.kodilla.good.patterns.challenge.food2door.provider.ExtraFoodShopDeliveryProvider;
import com.kodilla.good.patterns.challenge.food2door.provider.HealthyShopDeliveryProvider;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProductStore productStore = new ProductStore();

        Product burger = new Product("burger", 19.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product italy_pasta = new Product("italy pasta", 3.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product asia_curry = new Product("asia curry", 7.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product shitake_mushrooms = new Product("shitake mushrooms", 45.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product tofu = new Product("tofu", 9.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product coconut_milk = new Product("coconut milk", 9.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product wakame = new Product("wakame", 12.99, DeliveryProviderType.EXTRA_FOOD_SHOOP);
        Product carrot = new Product("carrot", 1.99, DeliveryProviderType.HEALTHY_SHOP);
        Product potato = new Product("potato", 2.99, DeliveryProviderType.HEALTHY_SHOP);
        Product onion = new Product("onion", 2.39, DeliveryProviderType.HEALTHY_SHOP);
        Product tomato = new Product("tomato", 15.99, DeliveryProviderType.HEALTHY_SHOP);
        Product apple = new Product("apple", 3.99, DeliveryProviderType.HEALTHY_SHOP);
        Product pear = new Product("pear", 5.99, DeliveryProviderType.HEALTHY_SHOP);
        Product chicken = new Product("chicken", 20.99, DeliveryProviderType.HEALTHY_SHOP);
        Product fish = new Product("fish", 39.99, DeliveryProviderType.HEALTHY_SHOP);
        Product oil = new Product("oil", 10.99, DeliveryProviderType.HEALTHY_SHOP);

        productStore.addProductToStore(burger, 5);
        productStore.addProductToStore(italy_pasta, 12);
        productStore.addProductToStore(asia_curry, 3);
        productStore.addProductToStore(shitake_mushrooms, 2);
        productStore.addProductToStore(coconut_milk, 20);
        productStore.addProductToStore(tofu, 14);
        productStore.addProductToStore(wakame, 7);
        productStore.addProductToStore(carrot, 70);
        productStore.addProductToStore(potato, 56);
        productStore.addProductToStore(onion, 40);
        productStore.addProductToStore(tomato, 23);
        productStore.addProductToStore(apple, 60);
        productStore.addProductToStore(pear, 52);
        productStore.addProductToStore(chicken, 41);
        productStore.addProductToStore(fish, 23);
        productStore.addProductToStore(oil, 17);

        User tom = new User("Tom");

        CartManager cartManager = new CartManager(productStore);
        cartManager.addProductToCartForUser(tom, pear,4);
        cartManager.addProductToCartForUser(tom, potato,4);
//        cartManager.addProductToCartForUser(tom, coconut_milk,2);
//        cartManager.addProductToCartForUser(tom, asia_curry,3);

        final HealthyShopDeliveryProvider healthyShopDeliveryProvider = new HealthyShopDeliveryProvider();
        final ExtraFoodShopDeliveryProvider extraFoodShopDeliveryProvider = new ExtraFoodShopDeliveryProvider();

        OrderManager orderManager = new OrderManager(Arrays.asList(
                healthyShopDeliveryProvider,
                extraFoodShopDeliveryProvider
        ));

        double cartValue = cartManager.calculateCartForUser(tom);
        System.out.println(cartValue);

        Order tomOrder = cartManager.createOrder(tom);
        double orderValue = tomOrder.calculateOrder();
        double deliveryCost = orderManager.calculateDeliveryCost(tomOrder);
        System.out.println("orderValue: " + orderValue);
        System.out.println("deliveryCost: " + deliveryCost);

    }
}
