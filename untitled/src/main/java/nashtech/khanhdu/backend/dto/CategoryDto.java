package nashtech.khanhdu.backend.dto;

import jakarta.validation.constraints.NotNull;

public record CategoryDto(@NotNull String name, String description) {
}
