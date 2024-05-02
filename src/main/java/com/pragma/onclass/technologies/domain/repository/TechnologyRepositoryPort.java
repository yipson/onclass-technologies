package com.pragma.onclass.technologies.domain.repository;

import com.pragma.onclass.technologies.domain.model.Technology;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TechnologyRepositoryPort {
    Mono<Technology> save(Technology technology);
    Mono<Boolean> existByName(String name);
    Flux<Technology> findAllSortByNameOrdered(Boolean isAscending, int page);
}
