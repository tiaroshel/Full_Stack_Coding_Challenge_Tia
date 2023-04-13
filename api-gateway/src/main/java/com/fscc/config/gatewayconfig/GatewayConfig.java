package com.ibm.fscc.apigateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fscc.apigateway.jwt.JwtAuthenticationFilter;

@Configuration
public class GatewayConfig {

        @Autowired
        private JwtAuthenticationFilter jwtFilter;

        @Bean
        public RouteLocator routes(RouteLocatorBuilder builder) {
                return builder.routes()
                                .route("login-service",
                                                r -> r.path("/login-ws/**").filters(f -> f.filter(jwtFilter))
                                                                .uri("lb://login-ws/"))
                                .route("employee-service",
                                                r -> r.path("/employee-ws/**").filters(f -> f.filter(jwtFilter))
                                                                .uri("lb://employee-ws/"))
                                .build();

        }
}