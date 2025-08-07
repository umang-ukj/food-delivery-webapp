package com.food.delivery.restaurantservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.restaurantservice.model.Restaurant;
import com.food.delivery.restaurantservice.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantRepository repo;

    public RestaurantController(RestaurantRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return repo.save(restaurant);
    }
}
