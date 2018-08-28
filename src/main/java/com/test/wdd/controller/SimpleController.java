package com.test.wdd.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weidongdong
 * @Description:
 * @Date: Created in 10:08 2018/5/17
 */
@RestController
public class SimpleController {
    private int i = 0;
    private static int j = 0;

    @RequestMapping("/helloworld")
    String home() {
        System.out.println(j++ + "|" + i++);
        return "Hello World!";
    }

    @RequestMapping("/helloworld2")
    String home2() {
        return "Hello World22SSS!" + "ssss" + "sssss";
    }
}
