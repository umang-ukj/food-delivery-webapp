package com.food.delivery.paymentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    private String paymentId;
    private String orderId;
    private String status;
    private String paymentMode;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Payment(String paymentId, String orderId, String status, String paymentMode) {
		super();
		this.paymentId = paymentId;
		this.orderId = orderId;
		this.status = status;
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", orderId=" + orderId + ", status=" + status + ", paymentMode="
				+ paymentMode + "]";
	}
    
}
