package com.pragma.onclass.technologies.adapter.driving.rest.model.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;

@Getter
@Validated
@AllArgsConstructor
public class TechnologyRq {
    @Size(min=1, max = 50, message = "This field should have less than 50 chars")
    private String name;

    @Size(min=1, max = 90, message = "This field should have less than 90 chars")
    private String description;
}
