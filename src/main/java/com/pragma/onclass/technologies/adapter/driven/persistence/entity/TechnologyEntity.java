package com.pragma.onclass.technologies.adapter.driven.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("technology")
public class TechnologyEntity {

    @Id
    private Long id;
    private String name;
    private String description;
}
