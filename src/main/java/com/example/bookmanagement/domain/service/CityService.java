package com.example.bookmanagement.domain.service;

import com.example.bookmanagement.application.exception.NotFoundException;
import com.example.bookmanagement.domain.model.City;
import com.example.bookmanagement.presentation.dto.request.CityRequestDto;

import java.util.List;

public interface CityService {
    List<City> findAll();

    City findById(Long id) throws NotFoundException;

    City save(City city);

    City delete(Long id);

    City addCity(CityRequestDto cityRequestDto);

    City getCityById(Long id) throws NotFoundException;

    List<City> getCities();

    City editCity(CityRequestDto cityRequestDto, Long id) throws NotFoundException;
}
