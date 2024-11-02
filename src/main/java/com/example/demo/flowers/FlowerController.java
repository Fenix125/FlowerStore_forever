package com.example.demo.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class FlowerController {
    private static final int SEPALLENGTH = 60;
    private static final double PRICE = 80.5;
    @GetMapping("/flowers")
    public List<Flower> getAllFlowers() {
        return List.of(new Flower(FlowerColor.RED, 
        SEPALLENGTH, PRICE, FlowerType.ROSE));
    }
}
