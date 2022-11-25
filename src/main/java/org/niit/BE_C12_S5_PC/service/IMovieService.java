package org.niit.BE_C12_S5_PC.service;

import org.niit.BE_C12_S5_PC.domain.Movie;

import java.util.List;

public interface IMovieService {

    public Movie saveMovie(Movie m);
    public List<Movie> getAllMovie();
}
