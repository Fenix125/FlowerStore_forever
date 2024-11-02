package com.example.demo.flowers;
import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

@ToString
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
    @Override
    public String getDescription() {
        String res = "";
        for (FlowerPack el : flowerPacks) {
            res += el.getDescription() + ", ";
        }
        return res.substring(0, res.length()-2);
    }
}

