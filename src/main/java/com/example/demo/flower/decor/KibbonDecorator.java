package com.example.demo.flower.decor;

import com.example.demo.flower.flowers.Item;

public class KibbonDecorator extends ItemDecorator {
    private static final double KIBBON_COST = 40.0;
    private Item item;
    public KibbonDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double getPrice() {
        return (KIBBON_COST + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
    public Item getItem() {
        return this.item;
    }
}
