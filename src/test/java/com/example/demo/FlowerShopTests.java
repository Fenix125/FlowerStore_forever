package com.example.demo;

import com.example.demo.flower.decor.PaperDecorator;
import com.example.demo.flower.flowers.Flower;
import com.example.demo.flower.flowers.FlowerBucket;
import com.example.demo.flower.flowers.FlowerColor;
import com.example.demo.flower.flowers.FlowerPack;
import com.example.demo.flower.flowers.FlowerType;
import com.example.demo.flower.flowers.Item;
import com.example.demo.flower.flowers.Order;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;

public class FlowerShopTests {
    private static final double BASE_FLOWER_PRICE = 80.5;
    private static final int QUANTITY_FLOWER_PACK = 2;
    private static final double PAPER_DECORATOR_COST = 13.0;
    private static final double BASKET_DECORATOR_COST = 4.0;
    private static final int SEPALLENGTH = 60;
    private static final double COSTDECORBASKET = 648.0;
    private Flower createStandardFlower() {
        return new Flower(FlowerColor.RED, SEPALLENGTH,
        BASE_FLOWER_PRICE, FlowerType.ROSE);
    }
    private FlowerPack createStandardFlowerPack() {
        return new FlowerPack(createStandardFlower(), QUANTITY_FLOWER_PACK);
    }
    @Test
    public void testFlowerCreationAndDescription() {
        Item flower = createStandardFlower();
        Assertions.assertNotNull(flower);
        Assertions.assertEquals("Flower(color=#FF0000, "
        +"sepallength=60, price=80.5, flowerType=ROSE)", 
        flower.getDescription());
        Assertions.assertEquals(BASE_FLOWER_PRICE, flower.getPrice());
    }
    @Test
    public void testFlowerWithPaperDecorator() {
        Item flower = createStandardFlower();
        flower = new PaperDecorator(flower);
        Assertions.assertEquals(BASE_FLOWER_PRICE 
        + PAPER_DECORATOR_COST, flower.getPrice());
    }
    @Test
    public void testFlowerPackCreation() {
        Item flowerPack = createStandardFlowerPack();
        Assertions.assertEquals(QUANTITY_FLOWER_PACK 
        * BASE_FLOWER_PRICE, flowerPack.getPrice());
    }

    @Test
    public void testFlowerBucketWithMultiplePacks() {
        Flower flower = createStandardFlower();
        FlowerPack flowerPack = new FlowerPack(flower, QUANTITY_FLOWER_PACK);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(2 * QUANTITY_FLOWER_PACK * BASE_FLOWER_PRICE, 
        flowerBucket.getPrice());
    }

    @Test
    public void testOrderWithItemsAndDecorators() {
        FlowerPack flowerPack = createStandardFlowerPack();
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);

        Order order = new Order();
        order.addItem(flowerBucket);
        order.addItem(flowerBucket);

        Assertions.assertEquals(2 * 2 * QUANTITY_FLOWER_PACK 
        * BASE_FLOWER_PRICE, order.getPrice());
        Assertions.assertEquals(order.getPrice() 
        + BASKET_DECORATOR_COST, COSTDECORBASKET);
    }
}
