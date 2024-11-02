package com.example.demo.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/")
    public String welcomeMessage() {
        return "<h2>Welcome to the Flower Store!</h2>" 
        + "<p>Available endpoints:</p>"
        + "<ul>"
        + "<li><a href=\"/store/flowers\">Flowers</a></li>"
        + "<li><a href=\"/store/payment\">Payments</a></li>"
        + "</ul>";
    }
}