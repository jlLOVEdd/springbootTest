package com.test.wdd.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weidongdong
 * @Description:
 * @Date: Created in 10:08 2018/5/17
 */
@RestController
public class SimpleController {
    @RequestMapping("/helloworld")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/helloworld2")
    @ResponseBody
    String home2() {
        return "Hello World22SSS!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}
