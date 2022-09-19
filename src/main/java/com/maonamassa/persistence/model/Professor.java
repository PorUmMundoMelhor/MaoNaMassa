package com.maonamassa.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

public class Professor {
    @NotEmpty(message = "The field name cannot e empty")
    private String name;

}
