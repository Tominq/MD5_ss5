package com.example.bookmanagement.domain.repository;

import com.example.bookmanagement.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
