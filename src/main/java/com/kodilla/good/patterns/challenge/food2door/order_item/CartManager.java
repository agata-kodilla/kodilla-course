package com.kodilla.good.patterns.challenge.food2door.order_item;

import com.kodilla.good.patterns.challenge.food2door.product_item.Product;
import com.kodilla.good.patterns.challenge.food2door.User;
import com.kodilla.good.patterns.challenge.food2door.product_item.ProductStore;

import java.util.HashMap;
import java.util.Map;

public class CartManager {
    private Map<User, Cart> cartUser;
    private ProductStore productStore;

    public CartManager(ProductStore productStore) {
        this.productStore = productStore;
        cartUser = new HashMap<>();
    }

    public Cart getCartByUser(User user) {
        if (cartUser.containsKey(user)) {
            return cartUser.get(user);
        } else {
            Cart cart = new Cart(user);
            cartUser.put(user, cart);
            return cart;
        }
    }

    public double calculateCartForUser(User user) {
        return cartUser.get(user).calculateCart();
    }

    public void addProductToCartForUser(User user, Product product, int amount) {
        getCartByUser(user).addToProductToCart(product, amount);
        productStore.updateProducts(product, amount);
    }

    public void deleteProductToCartForUser(User user, Product product, int amount) {
        cartUser.get(user).deleteProductFromCart(product, amount);
        productStore.restoreProducts(product, amount);
    }

    public Order createOrder(User user) {
        return new Order(getCartByUser(user));
    }

}
