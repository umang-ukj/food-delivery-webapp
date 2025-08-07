package com.food.delivery.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.paymentservice.model.Payment;
import com.food.delivery.paymentservice.repository.PaymentRepository;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository repository;

    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return repository.save(payment);
    }

    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}
