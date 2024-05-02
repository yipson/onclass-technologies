package com.pragma.onclass.technologies.adapter.driving.rest.handler;

import com.pragma.onclass.technologies.adapter.driving.rest.model.request.TechnologyRq;
import com.pragma.onclass.technologies.adapter.mapper.TechnologyMapper;
import com.pragma.onclass.technologies.domain.usecase.port.TechnologyPort;
import com.pragma.onclass.technologies.utils.TechnologyCreationException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TechnologyHandler {

    private final TechnologyPort technologyPort;
    private final TechnologyMapper mapper;

    public TechnologyHandler(TechnologyPort technologyPort, TechnologyMapper mapper) {
        this.technologyPort = technologyPort;
        this.mapper = mapper;
    }

    public Mono<ServerResponse> createTechnology(ServerRequest request) {

        return request.bodyToMono(TechnologyRq.class)
                .flatMap(technologyRq -> technologyPort.create(mapper.rqToDomain(technologyRq))
                        .flatMap(response -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(response))
                        .onErrorResume(TechnologyCreationException.class, ex ->
                                ServerResponse.badRequest()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(ex.getMessage()))
                );

    }
}
