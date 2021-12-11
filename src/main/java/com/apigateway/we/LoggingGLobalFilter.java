package com.apigateway.we;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LoggingGLobalFilter implements GlobalFilter {

    Logger logger = LoggerFactory.getLogger(LoggingGLobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {


        logger.info("Logger Filter -> {}", exchange.getRequest().getPath());

        return chain.filter(exchange);
    }
}
