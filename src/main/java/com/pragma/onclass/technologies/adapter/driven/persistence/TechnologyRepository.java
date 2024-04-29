package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends R2dbcRepository<TechnologyEntity, Long> {

}
