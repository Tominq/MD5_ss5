package com.example.bookmanagement.domain.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "author")
@Getter
@Setter
public class Author {
    @Column(name = "author_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column(name = "author_name")
    private String authorName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zipcode_id", referencedColumnName = "zipcode_id")
    private Zipcode zipcode;
}
