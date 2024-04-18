package com.pragma.onclass.technologies.adapter.driving.rest.mapper;

import com.pragma.onclass.technologies.adapter.driving.rest.model.TechnologyDto;
import com.pragma.onclass.technologies.adapter.driving.rest.model.request.TechnologyRq;
import com.pragma.onclass.technologies.domain.model.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TechnologyMapper {
    TechnologyMapper INSTANCE = Mappers.getMapper(TechnologyMapper.class);

    TechnologyDto domainToDto(Technology domain);
    Technology rqToDomain(TechnologyRq request);
}
