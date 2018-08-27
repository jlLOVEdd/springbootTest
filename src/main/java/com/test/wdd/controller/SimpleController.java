package com.test.wdd.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weidongdong
 * @Description:
 * @Date: Created in 10:08 2018/5/17
 */
@RestController
public class SimpleController {
    @RequestMapping("/helloworld")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/helloworld2")
    String home2() {
        return "Hello World22SSS!"+"ssss"+"sssss";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}
