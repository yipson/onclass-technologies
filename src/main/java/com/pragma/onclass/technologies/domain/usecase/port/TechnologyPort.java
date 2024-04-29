package com.pragma.onclass.technologies.domain.usecase.port;

import com.pragma.onclass.technologies.domain.model.Technology;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TechnologyPort {
    Mono<Technology> create(Technology technology);
    Flux<Technology> getTechnologies();
}
