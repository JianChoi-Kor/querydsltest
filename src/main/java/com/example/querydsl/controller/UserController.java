package com.example.querydsl.controller;

import com.example.querydsl.dto.ShopDto;
import com.example.querydsl.dto.UserDto;
import com.example.querydsl.entity.User;
import com.example.querydsl.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getUsers() {

        List<UserDto.UserResponse> userList = userService.getUsers();

        return ResponseEntity.ok(userList);
    }
}
