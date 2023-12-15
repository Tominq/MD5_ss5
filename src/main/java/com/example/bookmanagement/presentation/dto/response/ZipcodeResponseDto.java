package com.example.bookmanagement.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZipcodeResponseDto {
    private Long zipcodeId;
    private String zipcodeName;
}
