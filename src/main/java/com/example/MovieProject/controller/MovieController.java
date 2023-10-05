package com.example.MovieProject.controller;

import com.example.MovieProject.model.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Movie")
public class MovieController {

    @Value("${someDummyData}")
    String directorName;

    @GetMapping("/getMovies")
    Movie getMovies() {
        return new Movie("Mission impossible", "8.5", "10-8-2023");
    }

    @GetMapping("/getDirector")
    String getDirector() {
        return directorName;
    }

}
