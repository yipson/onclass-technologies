package com.pragma.onclass.technologies.domain.usecase.port;

import com.pragma.onclass.technologies.domain.model.Technology;

public interface TechnologyPort {
    Technology create(Technology technologyRq);
}
