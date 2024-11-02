package com.example.demo.delivery;
import java.util.List;
import com.example.demo.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Post Delivered: " + items);
    }
}
