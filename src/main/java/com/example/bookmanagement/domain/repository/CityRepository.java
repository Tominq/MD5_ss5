package com.example.bookmanagement.domain.repository;

import com.example.bookmanagement.domain.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    void update(City city);
}
