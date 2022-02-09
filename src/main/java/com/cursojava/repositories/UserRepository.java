package com.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
