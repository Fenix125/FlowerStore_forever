package com.example.demo.delivery;
import java.util.List;
import com.example.demo.flowers.Item;

public interface Delivery {
    void deliver(List<Item> items);
}