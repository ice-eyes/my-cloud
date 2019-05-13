package org.skier.learn.cloud.zuul.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @author 谢哲
 */
public class ProducerFallback implements FallbackProvider {
    /**
     * 要熔断的路由。zuul的熔断只支持到服务级别，不支持到路由级别
     *
     * @return
     */
    @Override
    public String getRoute() {
        return "learn-cloud-producer";
    }

    /**
     * 熔断返回的内容
     *
     * @param route 路由
     * @param cause
     * @return
     */
    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return null;
    }
}
