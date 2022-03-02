package com.mmatus.movieapp.movie.controller;

import com.mmatus.movieapp.movie.domain.entity.Cast;
import com.mmatus.movieapp.movie.domain.entity.Movie;
import com.mmatus.movieapp.movie.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieService movieService;

    @PostMapping("/")
    public ResponseEntity<Movie> createMovie(){
        Movie movie = new Movie();
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}
