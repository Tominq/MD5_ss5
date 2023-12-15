package com.example.bookmanagement.application.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.bookmanagement.application.exception.NotFoundException;
import com.example.bookmanagement.domain.model.City;
import com.example.bookmanagement.domain.service.CityService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api.library.com/v1/cities")
public class CityController {
    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> getCities() {
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) throws NotFoundException {
        return new ResponseEntity<>(cityService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<City> deleteCity(@PathVariable Long id) throws NotFoundException {
        City city = cityService.findById(id);
        cityService.delete(city.getCityId());
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<City> addCity(@RequestBody City city) {
        return new ResponseEntity<>(cityService.save(city), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> editCity(@RequestBody City city, @PathVariable Long id) throws NotFoundException {
        city.setCityId(cityService.findById(id).getCityId());
        return new ResponseEntity<>(cityService.save(city), HttpStatus.OK);
    }
}