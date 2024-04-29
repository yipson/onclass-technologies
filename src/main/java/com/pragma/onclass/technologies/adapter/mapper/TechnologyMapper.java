package com.pragma.onclass.technologies.adapter.mapper;

import com.pragma.onclass.technologies.adapter.driven.persistence.entity.TechnologyEntity;
import com.pragma.onclass.technologies.adapter.driving.rest.model.TechnologyDto;
import com.pragma.onclass.technologies.adapter.driving.rest.model.request.TechnologyRq;
import com.pragma.onclass.technologies.domain.model.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TechnologyMapper {
    TechnologyMapper INSTANCE = Mappers.getMapper(TechnologyMapper.class);

    TechnologyDto domainToDto(Technology domain);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    Technology rqToDomain(TechnologyRq request);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    TechnologyEntity domainToEntity(Technology domain);
}
