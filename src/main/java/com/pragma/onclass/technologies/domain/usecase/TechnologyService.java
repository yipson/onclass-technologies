package com.pragma.onclass.technologies.domain.usecase;

import com.pragma.onclass.technologies.adapter.mapper.TechnologyMapper;
import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.repository.TechnologyRepositoryPort;
import com.pragma.onclass.technologies.domain.usecase.port.TechnologyPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TechnologyService implements TechnologyPort {

    private final TechnologyRepositoryPort technologyRepositoryPort;

    @Autowired
    public TechnologyService(TechnologyRepositoryPort technologyRepositoryPort) {
        this.technologyRepositoryPort = technologyRepositoryPort;
    }

    @Override
    public Mono<Technology> create(Technology technology) {
        return technologyRepositoryPort.save(technology);
    }

    @Override
    public Flux<Technology> getTechnologies() {
        return technologyRepositoryPort.findAll();
    }
}
