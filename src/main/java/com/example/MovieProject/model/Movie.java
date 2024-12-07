package com.example.MovieProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

@Data
@AllArgsConstructor
public class Movie {

    public String movieName;
    public String rating;
    public String releaseDate;

    @JsonIgnore
    public String musicMaker;
}
