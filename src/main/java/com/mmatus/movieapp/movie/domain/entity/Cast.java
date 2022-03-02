package com.mmatus.movieapp.movie.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="cast_movie")
@Data
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cast_id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "cast")
    private Set<Movie> movies;

}
