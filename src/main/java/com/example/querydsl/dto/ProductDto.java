package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ProductDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ProductResponse {
        private Long id;
        private String shopName;
        private String categoryName;
        private String name;
        private Long price;
    }
}
