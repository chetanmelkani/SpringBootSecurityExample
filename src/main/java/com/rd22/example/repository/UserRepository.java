package com.rd22.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd22.example.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
