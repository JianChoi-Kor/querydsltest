package com.example.querydsl.controller;

import com.example.querydsl.dto.ProductDto;
import com.example.querydsl.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<?> getProducts() {
        List<ProductDto.ProductResponse> productResponseList = productService.getProducts();

        return ResponseEntity.ok(productResponseList);
    }
}
