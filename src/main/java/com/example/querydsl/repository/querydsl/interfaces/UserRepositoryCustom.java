package com.example.querydsl.repository.querydsl.interfaces;

import com.example.querydsl.dto.UserDto;
import com.example.querydsl.entity.User;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserDto.UserResponse> getUsers();
}
