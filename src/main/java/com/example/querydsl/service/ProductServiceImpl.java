package com.example.querydsl.service;

import com.example.querydsl.dto.ProductDto;
import com.example.querydsl.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto.ProductResponse> getProducts() {
        return productRepository.getProducts();
    }
}
