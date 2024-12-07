package com.example.MovieProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "director")
public class Director {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "salary")
    String salary;
    @Column(name = "exp")
    String experience;



}
