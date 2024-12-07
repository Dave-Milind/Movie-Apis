package com.example.MovieProject.service;

import com.example.MovieProject.entity.Director;
import com.example.MovieProject.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

   public List<Director> getDirectorsList(){
        return directorRepository.findAll();
    }

}
