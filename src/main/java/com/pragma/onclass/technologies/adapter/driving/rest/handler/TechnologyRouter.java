package com.pragma.onclass.technologies.adapter.driving.rest.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class TechnologyRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(TechnologyHandler technologyHandler) {
        return RouterFunctions
                .route(RequestPredicates.POST("/technology"), technologyHandler::createTechnology);
    }
}
