package com.apigateway.we.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {


    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocator routeLocator = routeLocatorBuilder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("CustomHeader","CustomURI")
                                .addRequestParameter("CustomParameret","CustomValue"))
                        .uri("http://httpbin.org:80"))

                .route(p -> p.path("/quote/**").uri("lb://QUOTE-SERVICE"))
                .route(p -> p.path("/premium/**").uri("lb://MSINSURENCEWE"))

                .build();



        return routeLocator;
    }

}
