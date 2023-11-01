package com.example.querydsl.service;

import com.example.querydsl.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto.ProductResponse> getProducts();
}
