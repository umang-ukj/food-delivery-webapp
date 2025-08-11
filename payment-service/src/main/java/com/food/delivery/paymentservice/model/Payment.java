package com.food.delivery.paymentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class Payment {
    @Id
    private String paymentId;
    private String orderId;
    private String paymentStatus;
    private double amount;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public Payment(String paymentId, String orderId, String paymentStatus, double amount) {
		super();
		this.paymentId = paymentId;
		this.orderId = orderId;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", orderId=" + orderId + ", paymentStatus=" + paymentStatus + ", amount="
				+ amount + "]";
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
    
}
