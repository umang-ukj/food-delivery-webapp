package com.food.delivery.deliveryservice.config;


import com.food.delivery.deliveryservice.model.Delivery;
import com.food.delivery.deliveryservice.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryConsumer {

    private final DeliveryRepository repository;

    @KafkaListener(topics = "payment-success", groupId = "delivery-group")
    public void consume(String orderId) {
        System.out.println("Received payment success for Order ID: " + orderId);

        Delivery delivery = Delivery.builder()
                .orderId(Long.parseLong(orderId))
                .deliveryAgent("Agent-" + (int)(Math.random()*100))
                .status("ASSIGNED")
                .build();

        repository.save(delivery);
        System.out.println("Delivery assigned for Order ID: " + orderId);
    }
}
