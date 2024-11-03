package com.example.demo.flower.payment;

import java.util.List;

import com.example.demo.flower.flowers.Item;

public interface Payment {
    double pay(List<Item> items);

}
