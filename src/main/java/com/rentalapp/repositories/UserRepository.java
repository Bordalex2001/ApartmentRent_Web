package com.rentalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentalapp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
