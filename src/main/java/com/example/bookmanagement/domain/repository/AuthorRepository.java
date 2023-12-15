package com.example.bookmanagement.domain.repository;

import com.example.bookmanagement.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByUsername(String username);

    void delete(Long id);
}
