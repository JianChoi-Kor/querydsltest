package com.example.querydsl.service;

import com.example.querydsl.dto.UserDto;
import com.example.querydsl.entity.User;
import com.example.querydsl.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto.UserResponse> getUsers() {
        return userRepository.getUsers();
    }
}
