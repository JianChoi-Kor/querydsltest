package com.example.querydsl.repository.querydsl.interfaces;

import com.example.querydsl.dto.ShopDto;

import java.util.List;

public interface ShopRepositoryCustom {

    List<ShopDto.ShopResponse> getShops();
}
