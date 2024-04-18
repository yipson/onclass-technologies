package com.pragma.onclass.technologies.adapter.driven.persistence;

import com.pragma.onclass.technologies.domain.model.Technology;
import com.pragma.onclass.technologies.domain.repository.TechnologyRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class TechnologyJpaAdapter implements TechnologyRepositoryPort {

    private static TechnologyRepository technologyRepository;
    @Override
    public Technology save(Technology technology) {

        return null;
    }
}
