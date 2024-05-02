package com.pragma.onclass.technologies.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TechnologyCreationException extends RuntimeException {
    public TechnologyCreationException(String message) {
        super(message);
    }

    public TechnologyCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
