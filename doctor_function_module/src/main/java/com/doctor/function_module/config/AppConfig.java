package com.doctor.function_module.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * GET-version:
 * Date:2021-01-28  14:51
 * Author: wxr
 */
@SpringBootConfiguration
public class AppConfig {
    @Bean
    @LoadBalanced//使用负载均衡？
    public RestTemplate restTemplate(){//RestTemplate？
        return new RestTemplate();
    }
}
