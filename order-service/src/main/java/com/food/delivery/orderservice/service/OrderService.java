package com.food.delivery.orderservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.food.delivery.orderservice.model.Order;
import com.food.delivery.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "order_topic";

    public OrderService(OrderRepository orderRepository, KafkaTemplate<String, String> kafkaTemplate) {
        this.orderRepository = orderRepository;
        this.kafkaTemplate = kafkaTemplate;
    }

    public Order placeOrder(Order order) {
        order.setStatus("CREATED");
        Order savedOrder = orderRepository.save(order);
        kafkaTemplate.send(TOPIC, "Order Placed: " + savedOrder.getId());
        return savedOrder;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
