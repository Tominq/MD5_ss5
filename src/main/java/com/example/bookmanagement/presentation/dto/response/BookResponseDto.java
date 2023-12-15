package com.example.bookmanagement.presentation.dto.response;

import com.example.bookmanagement.domain.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDto {
    private Long bookId;
    private String bookName;
    private Set<Author> authorSet;
}
