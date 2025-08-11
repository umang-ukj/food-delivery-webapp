package com.food.delivery.deliveryservice.controller;

import com.food.delivery.deliveryservice.model.Delivery;
import com.food.delivery.deliveryservice.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryRepository repository;

    @GetMapping
    public List<Delivery> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Delivery getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
