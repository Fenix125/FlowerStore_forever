package com.example.demo.flowers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;

public class Order {
    private List<Item> items;
    private double totalPrice;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        items = new ArrayList<>();
        totalPrice = 0;
    }
    public void addItem(Item it) {
        this.items.add(it);
        this.totalPrice += it.getPrice();
    }
    public Item removeItem(Item it) {
        return items.remove(items.indexOf(it));
    }
    public double getPrice() {
        return this.totalPrice;
    }
    public List<Item> chechItems() {
        return this.items;
    }
    public void processOrder() {
        payment.pay(items);
        delivery.deliver(items);
    }
    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }
    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }
}
