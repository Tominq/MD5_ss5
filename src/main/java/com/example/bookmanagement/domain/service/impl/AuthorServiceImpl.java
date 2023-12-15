//package com.example.bookmanagement.domain.service.impl;
//
//import com.example.bookmanagement.domain.model.Author;
//import com.example.bookmanagement.domain.repository.AuthorRepository;
//import com.example.bookmanagement.domain.repository.ZipcodeRepository;
//import com.example.bookmanagement.domain.service.AuthorService;
//import com.example.bookmanagement.presentation.dto.request.AuthorRequestDto;
//import com.example.bookmanagement.presentation.dto.response.AuthorResponseDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Service
//public class AuthorServiceImpl implements AuthorService {
//    private final AuthorRepository authorRepository;
//
//    private final ZipcodeRepository zipcodeRepository;
//
//    @Override
//    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto) {
//        Author author = new Author(authorRequestDto.getName(), authorRequestDto.getEmail());
//        authorRepository.save(author);
//        return mapToAuthorResponseDto(author);
//    }
//
//    @Override
//    public AuthorResponseDto getAuthorById(Long id) {
//        Optional<Author> author = authorRepository.findById(id);
//        if (author != null) {
//            return mapToAuthorResponseDto(author);
//        }
//        return null;
//    }
//
//    @Override
//    public List<AuthorResponseDto> getAuthors() {
//        List<Author> authors = authorRepository.findAll();
//        List<AuthorResponseDto> authorResponseDtos = new ArrayList<>();
//        for (Author author : authors) {
//            authorResponseDtos.add(mapToAuthorResponseDto(Optional.ofNullable(author)));
//        }
//        return authorResponseDtos;
//    }
//
//    @Override
//    public AuthorResponseDto deleteAuthor(Long id) {
//        Optional<Author> author = authorRepository.findById(id);
//        if (author != null) {
//            authorRepository.delete(id);
//            return mapToAuthorResponseDto(author);
//        }
//        return null;
//    }
//
//    @Override
//    public AuthorResponseDto editAuthor(Long id, AuthorRequestDto authorRequestDto) {
//        Optional<Author> author = authorRepository.findById(id);
//        if (author != null)
//            author.setName(authorRequestDto.getAuthorName());
//            authorRepository.update(author);
//            return mapToAuthorResponseDto(author);
//        }
//        return null;
//    }
//
//    @Override
//    public AuthorResponseDto addZipcodeToAuthor(Long zipcodeId, Long authorId) {
//        Author author = authorRepository.findById(authorId);
//        Zipcode zipcode = zipcodeRepository.findById(zipcodeId);
//        if (author != null && zipcode != null) {
//            author.setZipcode(zipcode);
//            authorRepository.update(author);
//            return mapToAuthorResponseDto(author);
//        }
//        return null;
//    }
//
//    @Override
//    public AuthorResponseDto removeZipcodeFromAuthor(Long id) {
//        Optional<Author> author = authorRepository.findById(id);
//        if (author != null) {
//            author.setZipcode(null);
//            authorRepository.update(author);
//            return mapToAuthorResponseDto(author);
//        }
//        return null;
//    }
//
//    private AuthorResponseDto mapToAuthorResponseDto(Optional<Author> author) {
//        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
//        authorResponseDto.setAuthorId(author.get().getAuthorId());
//        authorResponseDto.setAuthorName(author.get().getAuthorName());
//        if (author.get().getZipcode() != null) {
//            authorResponseDto.setZipcodeId(author.get().getZipcode().getZipcodeId());
//        }
//        return authorResponseDto;
//    }
//}
