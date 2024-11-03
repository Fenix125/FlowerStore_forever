package com.example.demo.flower.payment;

import java.util.List;

import com.example.demo.flower.flowers.Item;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(List<Item> items) {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        System.out.println("Paid using PayPal: " + price);
        return price;
    }
}

