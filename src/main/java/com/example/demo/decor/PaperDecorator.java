package com.example.demo.decor;

import com.example.demo.flowers.Item;

public class PaperDecorator extends ItemDecorator {
    private static final double PAPER_COST = 13.0;
    private Item item;
    public PaperDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double getPrice() {
        return (PAPER_COST + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
    public Item getItem() {
        return this.item;
    }
}
