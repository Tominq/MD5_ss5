package com.example.bookmanagement.domain.service.impl;

import com.example.bookmanagement.application.exception.NotFoundException;
import com.example.bookmanagement.domain.model.City;
import com.example.bookmanagement.domain.repository.CityRepository;
import com.example.bookmanagement.domain.service.CityService;
import com.example.bookmanagement.presentation.dto.request.CityRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) throws NotFoundException {
        return cityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("City not found"));
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City delete(Long id) {
        cityRepository.deleteById(id);
        return null;
    }

    @Override
    public City addCity(CityRequestDto cityRequestDto) {
        City city = new City(cityRequestDto.getCityName());
        return cityRepository.save(city);
    }

    @Override
    public City getCityById(Long id) throws NotFoundException {
        return cityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("City not found"));
    }

    @Override
    public List<City> getCities() {
        return findAll();
    }

    @Override
    public City editCity(CityRequestDto cityRequestDto, Long id) throws NotFoundException {
        City city = cityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("City not found"));
        city.setCityName(cityRequestDto.getCityName());
        return cityRepository.save(city);
    }
}