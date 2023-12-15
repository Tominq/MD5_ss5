package com.example.bookmanagement.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorResponseDto {
    private String authorName;
    private Long authorId;
    private Long zipcodeId;
}
