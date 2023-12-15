package com.example.bookmanagement.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthorRequestDto {
    @NotBlank
    @Size(min = 5, max = 50)
    private String authorName;

    @NotBlank
    @Size(min = 5, max = 15)
    private Long authorId;
}
