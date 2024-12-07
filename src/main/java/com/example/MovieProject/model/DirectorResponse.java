package com.example.MovieProject.model;

import com.example.MovieProject.entity.Director;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

public class DirectorResponse {

    @JsonProperty("id")
    Long id;

    @JsonProperty("director_name")
    String name;

    @JsonProperty("director_salary")
    String salary;

    @JsonProperty("director_experience")
    String experience;

   public DirectorResponse(Director director){
       this.id=director.getId();
       this.name=director.getName();
       this.salary=director.getSalary();
       this.experience=director.getExperience();
   }
}
