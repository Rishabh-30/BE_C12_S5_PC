package org.niit.BE_C12_S5_PC.service;

import org.niit.BE_C12_S5_PC.domain.Movie;
import org.niit.BE_C12_S5_PC.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie saveMovie(Movie m){
        return movieRepository.save(m);
    }
    @Override
    public List<Movie> getAllMovie(){
        return (List<Movie>)  movieRepository.findAll();
    }


}
