package com.food.delivery.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.delivery.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
