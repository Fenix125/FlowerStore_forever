package com.example.demo.payment;

import java.util.List;

import com.example.demo.flowers.Item;


public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(List<Item> items) {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        System.out.println("Paid with credit card: " + price);
        return price;
    }
}
