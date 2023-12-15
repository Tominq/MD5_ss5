package com.example.bookmanagement.presentation.dto.request;

import com.example.bookmanagement.domain.model.Author;
import com.example.bookmanagement.domain.model.Category;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
    @NotBlank
    private Long bookId;

    @NotBlank(message = "required")
    private String bookName;

    @NotBlank
    private Category category;

    @NotBlank
    private Set<Author> authorSet;
}
