package com.test.wdd.myproject.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author: weidongdong
 * @Description:
 * @Date: Created in 15:22 2018/8/28
 */
@Component
public class InitCache implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-------------------Chache starting-----------------");
    }
}
