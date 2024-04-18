package com.pragma.onclass.technologies.domain.usecase;

import com.pragma.onclass.technologies.adapter.driving.rest.mapper.TechnologyMapper;
import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.repository.TechnologyRepositoryPort;
import com.pragma.onclass.technologies.domain.usecase.port.TechnologyPort;

public class TechnologyService implements TechnologyPort {

    private final TechnologyRepositoryPort technologyRepositoryPort;
    private final TechnologyMapper technologyMapper;

    public TechnologyService(TechnologyRepositoryPort technologyRepositoryPort, TechnologyMapper technologyMapper) {
        this.technologyRepositoryPort = technologyRepositoryPort;
        this.technologyMapper = technologyMapper;
    }

    @Override
    public Technology create(Technology technology) {
        return technologyRepositoryPort.save(technology);
    }
}
