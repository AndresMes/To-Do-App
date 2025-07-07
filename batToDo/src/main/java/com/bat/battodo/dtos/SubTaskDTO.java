package com.bat.battodo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record SubTaskDTO(
        @NotBlank(message = "El titulo no puede estar vacío")
        @Size(max = 50, message = "El titulo no puede tener más de 50 caracteres")
        String title,
        @NotNull(message = "El estado no puede estar vacio")
        boolean completed
) {
}
