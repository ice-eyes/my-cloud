package org.skier.learn.cloud.api.producer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 谢哲
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();

}
