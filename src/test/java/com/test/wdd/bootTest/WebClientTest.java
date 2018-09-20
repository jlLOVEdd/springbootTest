package com.test.wdd.bootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * @Author: weidongdong
 * @Description:
 * @Date: Created in 16:12 2018/9/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WebClientTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void exampleTest() {
        System.out.println(this.webClient.get().uri("/helloworld").exchange().expectStatus().isOk()
                .expectBody(String.class).returnResult());
    }

}
