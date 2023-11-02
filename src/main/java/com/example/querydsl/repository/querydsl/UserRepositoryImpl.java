package com.example.querydsl.repository.querydsl;

import static com.example.querydsl.entity.QCategory.category;
import static com.example.querydsl.entity.QProduct.product;
import static com.example.querydsl.entity.QShop.shop;
import static com.example.querydsl.entity.QUser.user;
import static com.example.querydsl.entity.QUserInfo.userInfo;

import com.example.querydsl.dto.ProductDto;
import com.example.querydsl.dto.UserDto;
import com.example.querydsl.entity.User;
import com.example.querydsl.repository.querydsl.interfaces.UserRepositoryCustom;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<UserDto.UserResponse> getUsers() {
        return queryFactory
                .select(Projections.constructor(
                        UserDto.UserResponse.class,
                        user.id,
                        user.name,
                        userInfo.info))
                .from(user)
                .fetch();
    }
}
