package com.food.delivery.restaurantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.restaurantservice.model.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
