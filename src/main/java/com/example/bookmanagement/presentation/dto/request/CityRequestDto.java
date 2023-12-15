package com.example.bookmanagement.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityRequestDto {

    @NotBlank
    private Long cityId;

    @NotBlank
    private String cityName;
}
