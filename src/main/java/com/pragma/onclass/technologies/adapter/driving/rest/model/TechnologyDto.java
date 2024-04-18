package com.pragma.onclass.technologies.adapter.driving.rest.model;

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
