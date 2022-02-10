package com.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.entities.enums.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
