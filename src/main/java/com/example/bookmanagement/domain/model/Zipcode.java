package com.example.bookmanagement.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "zipcode")
public class Zipcode {
    @Id
    @Column(name = "zipcode_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long zipcodeId;

    @Column(nullable = false)
    private String zipcodeName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private City city;
}
