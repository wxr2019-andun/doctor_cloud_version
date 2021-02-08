package com.doctor.gateway_demo_two.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * Description:
 * GET-version:
 * Date:2021-02-05  17:08
 * Author: wxr
 */

@Component
public class AccessFilter implements GlobalFilter, Ordered {
    private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取请求参数
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        String account_prefix = "gateway_account_";
        String account = account_prefix + exchange.getRequest().getQueryParams().getFirst("account");
        String token_data;

        // 业务逻辑处理
        if (null == token || null == account) {
            logger.warn("token/account is null...");
            ServerHttpResponse response = exchange.getResponse();

            response.getHeaders().add("Content-Type", "application/json; charset=utf-8"); // 响应类型
            response.setStatusCode(HttpStatus.UNAUTHORIZED); // 响应状态码，HTTP 401 错误代表用户没有访问权限
            String message = "{\"message\":\"" + HttpStatus.UNAUTHORIZED.getReasonPhrase() + "\"}";  // 响应内容
            DataBuffer buffer = response.bufferFactory().wrap(message.getBytes());

            // 请求结束，不在继续向下请求
            return response.writeWith(Mono.just(buffer));
        }

        token_data = stringRedisTemplate.opsForValue().get(account);
        if(!token.equals(token_data)){
            logger.warn("token data error...");
            ServerHttpResponse response = exchange.getResponse();

            response.getHeaders().add("Content-Type", "application/json; charset=utf-8"); // 响应类型
            response.setStatusCode(HttpStatus.UNAUTHORIZED); // 响应状态码，HTTP 401 错误代表用户没有访问权限
            String message = "{\"message\":\"" + HttpStatus.UNAUTHORIZED.getReasonPhrase() + "\"}";  // 响应内容
            DataBuffer buffer = response.bufferFactory().wrap(message.getBytes());

            // 请求结束，不在继续向下请求
            return response.writeWith(Mono.just(buffer));
        }

        // 使用 token 进行身份验证
        logger.info("identity verify succeed:"+account);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
