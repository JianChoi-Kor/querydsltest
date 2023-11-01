package com.example.querydsl.repository.querydsl;

import com.example.querydsl.dto.ProductDto;
import com.example.querydsl.repository.querydsl.interfaces.ProductRepositoryCustom;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.querydsl.entity.QCategory.category;
import static com.example.querydsl.entity.QProduct.product;
import static com.example.querydsl.entity.QShop.shop;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ProductDto.ProductResponse> getProducts() {

        return queryFactory.select(Projections.constructor(
                        ProductDto.ProductResponse.class,
                        product.id,
                        shop.name,
                        category.name,
                        product.name,
                        product.price))
                .from(product)
                .fetch();
    }
}
