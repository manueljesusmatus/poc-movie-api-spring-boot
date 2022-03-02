package com.mmatus.movieapp.movie.service.implement;

import com.mmatus.movieapp.movie.domain.entity.Movie;
import com.mmatus.movieapp.movie.repository.MovieRepository;
import com.mmatus.movieapp.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Page<Movie> readMovie(int page, int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("release_date").descending());
        return movieRepository.findAll(pageable);
    }

    @Override
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public Movie deleteMovie(Movie movie){
        try{
            movieRepository.delete(movie);
        }catch(Exception ex){
            throw ex;
        }
        return movie;
    }

}
