package com.allen.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author allen
 * @date 2021/5/20 11:59
 */

@EnableZuulProxy
@SpringBootApplication
public class RoutingAndFilteringGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
