package com.example.querydsl.repository.querydsl;

import static com.example.querydsl.entity.QUser.user;
import static com.example.querydsl.entity.QUserInfo.userInfo;

import com.example.querydsl.entity.User;
import com.example.querydsl.repository.querydsl.interfaces.UserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<User> getUsers() {
        return queryFactory
                .selectFrom(user)
                .where(user.name.eq(user.userInfo.info))
                .fetch();
    }
}
