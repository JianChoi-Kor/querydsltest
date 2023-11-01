package com.example.querydsl;

import com.example.querydsl.entity.Category;
import com.example.querydsl.entity.Product;
import com.example.querydsl.entity.Shop;
import com.example.querydsl.repository.CategoryRepository;
import com.example.querydsl.repository.ProductRepository;
import com.example.querydsl.repository.ShopRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ShopServiceTests {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("테스트 데이터 세팅")
    void insertDate1() {
        //save shopList
        List<Shop> shopList = new ArrayList<>();
        shopList.add(Shop.builder().name("shop1").address("address1").build());
        shopList.add(Shop.builder().name("shop2").address("address2").build());
        shopList.add(Shop.builder().name("shop3").address("address3").build());
        shopList.add(Shop.builder().name("shop4").address("address4").build());
        shopRepository.saveAll(shopList);

        //save categories
        Category category = Category.builder().name("category1").build();
        categoryRepository.save(category);
    }

    @Test
    @DisplayName("테스트 데이터 세팅")
    void insertDate2() {
        Long shopId = 4L;
        Category category = categoryRepository.findById(1L).orElseThrow(() -> new RuntimeException("exception"));

        Shop shop = shopRepository.findById(shopId).orElseThrow(() -> new RuntimeException("exception"));
        List<Product> productList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            productList.add(Product.builder().shop(shop).name("product" + shopId + "_" + i).category(category).price(i * 1000L).build());
        }
        productRepository.saveAll(productList);
    }
}
