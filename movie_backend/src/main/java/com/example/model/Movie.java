package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieid;
    private String title;
    private String genres;
}
