package com.example.querydsl.repository;

import com.example.querydsl.entity.User;
import com.example.querydsl.repository.querydsl.interfaces.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
