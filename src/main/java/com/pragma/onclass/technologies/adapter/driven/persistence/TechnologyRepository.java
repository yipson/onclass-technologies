package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import com.pragma.onclass.technologies.domain.model.Technology;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface TechnologyRepository extends R2dbcRepository<TechnologyEntity, Long> {
    Flux<TechnologyEntity> findAll(Sort sort);
}
