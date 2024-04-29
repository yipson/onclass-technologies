package com.pragma.onclass.technologies.adapter.mapper;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import com.pragma.onclass.technologies.adapter.driving.rest.model.TechnologyDto;
import com.pragma.onclass.technologies.adapter.driving.rest.model.request.TechnologyRq;
import com.pragma.onclass.technologies.domain.model.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import reactor.core.publisher.Flux;

@Mapper(componentModel = "spring")
public interface TechnologyMapper {
    TechnologyMapper INSTANCE = Mappers.getMapper(TechnologyMapper.class);

    TechnologyDto domainToDto(Technology domain);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(target = "id", ignore = true)
    Technology rqToDomain(TechnologyRq request);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(target = "id", ignore = true)
    TechnologyEntity domainToEntity(Technology domain);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    Technology entityToDomain(TechnologyEntity entity);

    default Flux<Technology> entitiesToDomains(Flux<TechnologyEntity> entityFlux) {
        return entityFlux.map(this::entityToDomain);
    }
}
