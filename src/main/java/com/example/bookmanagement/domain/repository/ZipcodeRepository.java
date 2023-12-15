package com.example.bookmanagement.domain.repository;

import com.example.bookmanagement.domain.model.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
}
