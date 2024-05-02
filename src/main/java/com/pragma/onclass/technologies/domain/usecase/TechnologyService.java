package com.pragma.onclass.technologies.domain.usecase;

import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.repository.TechnologyRepositoryPort;
import com.pragma.onclass.technologies.domain.usecase.port.TechnologyPort;
import com.pragma.onclass.technologies.utils.TechnologyCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        return this.existByName(technology.getName())
                .flatMap(exist -> {
                    if(exist) return Mono.error(new TechnologyCreationException("This Technology name is already in use."));
                    return technologyRepositoryPort.save(technology);
                });
    }

    private Mono<Boolean> existByName(String name) {
        return technologyRepositoryPort.existByName(name);
    }
}
