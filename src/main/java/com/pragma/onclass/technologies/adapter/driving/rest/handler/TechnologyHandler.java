package com.pragma.onclass.technologies.adapter.driving.rest.handler;

import com.pragma.onclass.technologies.domain.usecase.port.TechnologyPort;
import com.pragma.onclass.technologies.adapter.driving.rest.model.TechnologyDto;
import com.pragma.onclass.technologies.adapter.driving.rest.model.request.TechnologyRq;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TechnologyHandler {

    private final TechnologyPort technologyPort;

    public TechnologyHandler(TechnologyPort technologyPort) {
        this.technologyPort = technologyPort;
    }

    public Mono<ServerResponse> createTechnology(ServerRequest request) {

        return request.bodyToMono(TechnologyRq.class)
                .flatMap(technologyRq -> {
                    return ServerResponse.ok()
                           .contentType(MediaType.APPLICATION_JSON)
                           .body(technologyPort.create(technologyRq), TechnologyDto.class);
                });

    }
}
