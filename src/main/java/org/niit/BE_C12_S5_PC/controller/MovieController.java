package org.niit.BE_C12_S5_PC.controller;

import org.niit.BE_C12_S5_PC.domain.Movie;
import org.niit.BE_C12_S5_PC.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class MovieController {
    private IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/savemovie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie m){
        return new ResponseEntity<>(movieService.saveMovie(m), HttpStatus.CREATED);
    }
    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovie(){
        return new ResponseEntity<>(movieService.getAllMovie(),HttpStatus.OK);
    }
}
