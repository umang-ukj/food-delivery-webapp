package com.food.delivery.paymentservice.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.food.delivery.paymentservice.model.Payment;
import com.food.delivery.paymentservice.repository.PaymentRepository;

@Service
public class KafkaConsumerService {

	private final PaymentRepository paymentRepository;
    public KafkaConsumerService(PaymentRepository paymentRepository, KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.paymentRepository = paymentRepository;
		this.kafkaTemplate = kafkaTemplate;
	}

	private final KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void processPayment(String message) {
        System.out.println("Received Order for Payment: " + message);

        Payment payment = Payment.builder()
                .orderId(message)
                .amount(500.0) // fixed for now
                .paymentStatus("SUCCESS")
                .build();
        paymentRepository.save(payment);

        kafkaTemplate.send("payment-topic", message + " : Payment Successful");
    }
}

