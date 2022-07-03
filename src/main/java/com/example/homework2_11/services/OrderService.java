package com.example.homework2_11.services;

import com.example.homework2_11.components.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}
