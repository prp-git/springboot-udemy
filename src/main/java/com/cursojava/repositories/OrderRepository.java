package com.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
