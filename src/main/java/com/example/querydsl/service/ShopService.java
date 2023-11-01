package com.example.querydsl.service;

import com.example.querydsl.dto.ShopDto;

import java.util.List;

public interface ShopService {
    List<ShopDto.ShopResponse> getShops();
}
