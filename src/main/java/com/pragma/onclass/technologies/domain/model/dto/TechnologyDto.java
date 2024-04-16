package com.pragma.onclass.technologies.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TechnologyDto {
    private Long id;
    private String name;
    private String description;
}
