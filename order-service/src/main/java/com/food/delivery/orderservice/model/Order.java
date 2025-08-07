package com.food.delivery.orderservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long restaurantId;
    private String items; // comma-separated or later use JSON
    private String status; // e.g. PENDING, CONFIRMED
    private LocalDateTime createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", restaurantId=" + restaurantId + ", items=" + items
				+ ", status=" + status + ", createdAt=" + createdAt + "]";
	}
	public Order(Long id, Long userId, Long restaurantId, String items, String status, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.items = items;
		this.status = status;
		this.createdAt = createdAt;
	}
	public Order() {
		super();
	}
    
}
