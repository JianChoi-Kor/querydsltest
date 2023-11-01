package com.example.querydsl.service;

import com.example.querydsl.dto.ShopDto;
import com.example.querydsl.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    @Override
    public List<ShopDto.ShopResponse> getShops() {
        return shopRepository.getShops();
    }
}
