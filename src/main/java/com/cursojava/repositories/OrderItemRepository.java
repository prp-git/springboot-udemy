package com.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
