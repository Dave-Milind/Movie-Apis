package com.example.MovieProject.controller;

import com.example.MovieProject.entity.Director;
import com.example.MovieProject.model.DirectorResponse;
import com.example.MovieProject.model.Movie;
import com.example.MovieProject.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Movie")
public class MovieController {

    @Autowired
    DirectorService directorService;

    @Value("${someDummyData}")
    String directorName;

    @GetMapping("/getMovies")
    Movie getMovies() {
       Movie movie= new Movie("Mission impossible", "8.5", "10-8-2023", "something");
       movie.setRating("7.5");

       return movie;
    }

    @GetMapping("/get-directors")
    List<DirectorResponse> getDirectors(){

       List<Director> directorList= directorService.getDirectorsList();
        List<DirectorResponse> directorResponseList=new ArrayList<DirectorResponse>();

        directorList.forEach(director -> {

            directorResponseList.add(new DirectorResponse(director));

        });

        return directorResponseList;
    }

    @GetMapping("/getDirector")
    String getDirector() {
        return directorName;
    }

}
