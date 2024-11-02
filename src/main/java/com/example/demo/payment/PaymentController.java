package com.example.demo.payment;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


import org.reflections.Reflections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Set;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/store")
public class PaymentController {
    @GetMapping("/payment")
    public List<String> getPayments() {
        Reflections reflections = new Reflections("com.example.demo");
        Set<Class<
        ?
        extends Payment>> subclasses = 
        reflections.getSubTypesOf(Payment.class);
        return subclasses.stream().map(Class::getSimpleName)
        .collect(Collectors.toList());
    }
}
