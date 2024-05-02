package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface TechnologyRepository extends R2dbcRepository<TechnologyEntity, Long> {
    Mono<TechnologyEntity> save(TechnologyEntity technologyEntityToSave);
    Mono<Boolean> existsByName(String name);
    Flux<TechnologyEntity> findAllBy(Pageable pageable);

}
