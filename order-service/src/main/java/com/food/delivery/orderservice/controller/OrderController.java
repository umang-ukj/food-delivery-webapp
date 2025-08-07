package com.food.delivery.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.orderservice.model.Order;
import com.food.delivery.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> allOrders() {
        return service.getAllOrders();
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.placeOrder(order);
    }
}
