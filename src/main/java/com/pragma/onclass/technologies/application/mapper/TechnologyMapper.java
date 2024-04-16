package com.pragma.onclass.technologies.application.mapper;

import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.model.dto.TechnologyDto;
import com.pragma.onclass.technologies.domain.model.request.TechnologyRq;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TechnologyMapper {
    TechnologyMapper INSTANCE = Mappers.getMapper(TechnologyMapper.class);

    TechnologyDto domainToDto(Technology domain);
    Technology rqToDomain(TechnologyRq request);
}
