package com.food.delivery.restaurantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String cuisine;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", cuisine=" + cuisine + "]";
	}

}
