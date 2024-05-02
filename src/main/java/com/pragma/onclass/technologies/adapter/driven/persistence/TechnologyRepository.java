package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TechnologyRepository extends ReactiveCrudRepository<TechnologyEntity, Long> {
    Mono<Boolean> existsByName(String name);
}
