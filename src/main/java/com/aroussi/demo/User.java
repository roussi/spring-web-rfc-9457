package com.aroussi.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record User(
        @NotNull(message = "id must not be null") Long id,
        @NotEmpty(message = "name must not be empty") String name,
        @Email(message = "email should be valid") String email) {
}
