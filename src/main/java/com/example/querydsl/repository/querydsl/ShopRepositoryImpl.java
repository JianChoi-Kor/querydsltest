package com.example.querydsl.repository.querydsl;

import static com.example.querydsl.entity.QShop.shop;
import static com.example.querydsl.entity.QProduct.product;

import com.example.querydsl.dto.ShopDto;
import com.example.querydsl.repository.querydsl.interfaces.ShopRepositoryCustom;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ShopRepositoryImpl implements ShopRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ShopDto.ShopResponse> getShops() {

        NumberPath<Long> countQuantity = Expressions.numberPath(Long.class, "productCount");

        return queryFactory.select(Projections.constructor(ShopDto.ShopResponse.class,
                        shop.id,
                        shop.name,
                        shop.address,
                        Expressions.as(JPAExpressions.select(product.id.count())
                                .from(product)
                                .where(product.shop.eq(shop)), "productCount")))
                .from(shop)
                .orderBy(countQuantity.desc())

                .fetch();
    }
}
