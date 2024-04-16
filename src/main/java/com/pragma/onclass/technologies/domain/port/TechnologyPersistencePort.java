package com.pragma.onclass.technologies.domain.port;

import com.pragma.onclass.technologies.domain.model.Technology;

public interface TechnologyPersistencePort {
    Technology save(Technology technology);
}
