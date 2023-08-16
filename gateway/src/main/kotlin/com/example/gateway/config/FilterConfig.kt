package com.example.gateway.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.filters
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FilterConfig {

    @Bean
    fun gatewayRoutes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes {
            route(id = "first-service") {
                path("/first-service/**")
                filters {
                    addRequestHeader("first-request", "first-request-header")
                    addResponseHeader("first-response", "first-response-header")
                }
                uri("http://localhost:8081/")
            }
            route(id = "second-service") {
                path("/second-service/**")
                filters {
                    addRequestHeader("second-request", "second-request-header")
                    addResponseHeader("second-response", "second-response-header")
                }
                uri("http://localhost:8082/")
            }
        }
    }
}
