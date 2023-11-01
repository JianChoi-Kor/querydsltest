package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ShopDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ShopResponse {
        private Long id;
        private String name;
        private String address;
        private Long productCount;
    }
}
