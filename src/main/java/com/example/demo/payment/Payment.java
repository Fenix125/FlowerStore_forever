package com.example.demo.payment;

import java.util.List;

import com.example.demo.flowers.Item;

public interface Payment {
    double pay(List<Item> items);

}
