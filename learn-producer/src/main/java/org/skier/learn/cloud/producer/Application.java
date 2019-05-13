package org.skier.learn.cloud.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢哲
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping
public class Application {

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.client.ip-address}")
    private String ipAddress;

    @Value("${eureka.instance.instance-id}")
    private String eurekaInstanceId;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello, producer ip is " + ipAddress + ", port is " + port;
    }

    @GetMapping("/instance-id")
    public String getProducerInstanceId() {
        return eurekaInstanceId;
    }

    @GetMapping("/foo")
    public String foo(@RequestParam String foo) {
        return "eurekaInstanceId=" + eurekaInstanceId + ", foo=" + foo;
    }

}
