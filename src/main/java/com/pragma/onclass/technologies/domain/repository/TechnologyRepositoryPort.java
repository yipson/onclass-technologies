package com.pragma.onclass.technologies.domain.repository;

import com.pragma.onclass.technologies.domain.model.Technology;

public interface TechnologyRepositoryPort {
    Technology save(Technology technology);
}
