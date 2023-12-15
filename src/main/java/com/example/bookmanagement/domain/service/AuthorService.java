package com.example.bookmanagement.domain.service;

import com.example.bookmanagement.presentation.dto.request.AuthorRequestDto;
import com.example.bookmanagement.presentation.dto.response.AuthorResponseDto;

import java.util.List;

public interface AuthorService {
    AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto);

    AuthorResponseDto getAuthorById(Long id);

    List<AuthorResponseDto> getAuthors();

    AuthorResponseDto deleteAuthor(Long id);

    AuthorResponseDto editAuthor(Long id, AuthorRequestDto authorRequestDto);

    AuthorResponseDto addZipcodeToAuthor(Long zipcodeId, Long authorId);

    AuthorResponseDto removeZipcodeFromAuthor(Long id);
}
