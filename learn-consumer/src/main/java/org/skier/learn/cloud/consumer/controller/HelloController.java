package org.skier.learn.cloud.consumer.controller;

import org.skier.learn.cloud.api.producer.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢哲
 */
@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }

}
