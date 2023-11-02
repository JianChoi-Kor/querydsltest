package com.example.querydsl.service;

import com.example.querydsl.dto.UserDto;
import com.example.querydsl.entity.User;

import java.util.List;

public interface UserService {
    List<UserDto.UserResponse> getUsers();
}
