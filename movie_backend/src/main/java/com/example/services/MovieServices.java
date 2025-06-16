package com.example.services;

import com.example.model.Movie;
import com.example.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MovieServices {
    @Autowired
    Repo repo;
    Movie m1;
    Random r1 = new Random();
    public Movie Random() {
        int ran1 = r1.nextInt(Math.toIntExact(repo.count()));
        System.out.println(repo.count());
     //   m1 = repo.getById(ran1);
//        System.out.println(m1.getGenres());
//        System.out.println(m1.getTitle());
//        System.out.println(m1.getMovieid());
        return repo.getById(ran1);
    }

    public List<Movie> SpecificGenres(String s) {
        System.out.println(repo.findByGenresContaining(s).toString());
        return repo.findByGenresContaining(s);
    }
}
