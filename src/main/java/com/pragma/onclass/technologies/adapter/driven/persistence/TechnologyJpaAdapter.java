package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import com.pragma.onclass.technologies.adapter.mapper.TechnologyMapper;
import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.repository.TechnologyRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TechnologyJpaAdapter implements TechnologyRepositoryPort {

    private final TechnologyRepository technologyRepository;
    private final TechnologyMapper technologyMapper;

    @Autowired
    public TechnologyJpaAdapter(TechnologyRepository technologyRepository, TechnologyMapper technologyMapper) {
        this.technologyRepository = technologyRepository;
        this.technologyMapper = technologyMapper;
    }


    @Override
    public Mono<Technology> save(Technology technology) {
        TechnologyEntity technologyEntityToSave = technologyMapper.domainToEntity(technology);
        Mono<TechnologyEntity> technologyEntitySaved = technologyRepository.save(technologyEntityToSave);
        return technologyEntitySaved.map(technologyEntity ->
             Technology.builder()
                    .id(technologyEntity.getId())
                    .name(technologyEntity.getName())
                    .description(technologyEntity.getDescription())
                    .build()
        );
    }

    @Override
    public Mono<Boolean> existByName(String name) {
        return technologyRepository.existsByName(name);
    }
}
