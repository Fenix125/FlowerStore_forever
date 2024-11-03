package com.example.demo.flower.delivery;
import java.util.List;

import com.example.demo.flower.flowers.Item;

public interface Delivery {
    void deliver(List<Item> items);
}