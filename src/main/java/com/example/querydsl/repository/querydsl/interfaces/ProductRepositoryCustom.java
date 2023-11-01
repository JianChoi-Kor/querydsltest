package com.example.querydsl.repository.querydsl.interfaces;

import com.example.querydsl.dto.ProductDto;

import java.util.List;

public interface ProductRepositoryCustom {
    List<ProductDto.ProductResponse> getProducts();
}
