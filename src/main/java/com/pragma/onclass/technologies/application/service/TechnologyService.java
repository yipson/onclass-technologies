package com.pragma.onclass.technologies.application.service;

import com.pragma.onclass.technologies.application.mapper.TechnologyMapper;
import com.pragma.onclass.technologies.application.port.TechnologyPort;
import com.pragma.onclass.technologies.domain.model.dto.TechnologyDto;
import com.pragma.onclass.technologies.domain.model.request.TechnologyRq;
import com.pragma.onclass.technologies.domain.port.TechnologyPersistencePort;

public class TechnologyService implements TechnologyPort {

    private final TechnologyPersistencePort technologyPersistencePort;
    private final TechnologyMapper technologyMapper;

    public TechnologyService(TechnologyPersistencePort technologyPersistencePort, TechnologyMapper technologyMapper) {
        this.technologyPersistencePort = technologyPersistencePort;
        this.technologyMapper = technologyMapper;
    }

    @Override
    public TechnologyDto save(TechnologyRq technologyRq) {
        var technologyToCreate = technologyMapper.rqToDomain(technologyRq);
        var technologyNew = technologyPersistencePort.save(technologyToCreate);
        return technologyMapper.domainToDto(technologyNew);
    }
}
