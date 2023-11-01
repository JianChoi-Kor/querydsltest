package com.example.querydsl.repository;

import com.example.querydsl.entity.Product;
import com.example.querydsl.repository.querydsl.interfaces.ProductRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryCustom {

}
