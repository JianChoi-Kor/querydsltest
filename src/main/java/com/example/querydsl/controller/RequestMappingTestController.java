package com.example.querydsl.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RequestMappingTestController {

//    @RequestMapping("/request/{value:[a-z]*}")
//    public void request(@PathVariable String value) {
//        System.out.println("value: " + value);
//    }
//
//    @RequestMapping("/request/{value:[a-zA-Z]*}")
//    public void request1(@PathVariable String value) {
//        System.out.println("request1 value: " + value);
//    }
//
//    @RequestMapping("/request/{value:[A-Z]*}")
//    public void request2(@PathVariable String value) {
//        System.out.println("[A-Z] value: " + value);
//    }
//
//    @RequestMapping("/request/{value:[0-9]*}")
//    public void request2(@PathVariable String value) {
//        System.out.println("request2 value: " + value);
//    }
//
//    @RequestMapping("/request/{value:[0-9]{0,3}}")
//    public void request3(@PathVariable String value) {
//        System.out.println("request3 value: " + value);
//    }
//
//    @RequestMapping("/request/{value:(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{3,}}")
//    public void request3(@PathVariable String value) {
//        System.out.println("request3 value: " + value);
//    }

    @RequestMapping("/request/{*value}")
    public void request(@PathVariable String value) {
        System.out.println("request value: " + value);
    }
}
