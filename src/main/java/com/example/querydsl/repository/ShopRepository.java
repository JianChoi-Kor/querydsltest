package com.example.querydsl.repository;

import com.example.querydsl.entity.Shop;
import com.example.querydsl.repository.querydsl.interfaces.ShopRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long>, ShopRepositoryCustom {

}
