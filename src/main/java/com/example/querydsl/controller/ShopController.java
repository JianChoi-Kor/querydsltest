package com.example.querydsl.controller;

import com.example.querydsl.dto.ShopDto;
import com.example.querydsl.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ShopController {

    private final ShopService shopService;

    @GetMapping
    public ResponseEntity<?> getShops() {

        List<ShopDto.ShopResponse> shopResponses = shopService.getShops();

        return ResponseEntity.ok(shopResponses);
    }
}
