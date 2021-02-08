package com.doctor.gateway_demo_two.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Description:
 * GET-version:
 * Date:2021-02-05  17:00
 * Author: wxr
 */

public class CustomGatewayFilter implements GlobalFilter, Ordered {
    private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * @Description: 过滤器业务逻辑
     * @ Data 17:01 2021/2/5
     * @ GET-Version:
     * @ Author: wxr
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        log.info("自定义网关过滤器被执行");
        logger.info("自定义全局过滤器被执行");
        return chain.filter(exchange);
    }

    /**
     * 过滤器执行顺序，数值越小，优先级越高
     *
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
