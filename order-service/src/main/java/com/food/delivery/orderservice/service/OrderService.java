package com.food.delivery.orderservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.food.delivery.orderservice.model.Order;
import com.food.delivery.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    public Order placeOrder(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        order.setStatus("PENDING");
        return repo.save(order);
    }
}
