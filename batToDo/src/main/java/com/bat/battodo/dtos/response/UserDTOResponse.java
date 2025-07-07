package com.bat.battodo.dtos.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTOResponse(
        @NotBlank(message = "El nombre no puede estar vacío")
        @Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
        String name
) {
}
