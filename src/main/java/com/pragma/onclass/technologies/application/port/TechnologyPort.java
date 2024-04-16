package com.pragma.onclass.technologies.application.port;

import com.pragma.onclass.technologies.domain.model.dto.TechnologyDto;
import com.pragma.onclass.technologies.domain.model.request.TechnologyRq;

public interface TechnologyPort {
    TechnologyDto save(TechnologyRq technologyRq);
}
