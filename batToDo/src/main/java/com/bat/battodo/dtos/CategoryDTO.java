package com.bat.battodo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryDTO(
        @NotBlank(message = "El nombre no puede estar vacío")
        @Size(max = 20, message = "El nombre no puede tener más de 20 caracteres")
        String name
) {
}
