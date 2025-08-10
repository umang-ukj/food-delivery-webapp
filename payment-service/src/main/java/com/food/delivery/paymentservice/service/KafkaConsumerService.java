package com.food.delivery.paymentservice.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void consumeOrderEvent(String orderJson) {
        System.out.println("Received Order Event: " + orderJson);
        // Call payment processing logic here
    }
}

