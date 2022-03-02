package com.mmatus.movieapp.movie.service;

import com.mmatus.movieapp.movie.domain.entity.Movie;
import org.springframework.data.domain.Page;

public interface MovieService {

    public Movie createMovie(Movie movie);

    public Movie updateMovie(Movie movie);

    public Movie deleteMovie(Movie movie);

    public Page<Movie> readMovie(int page, int size);

}
