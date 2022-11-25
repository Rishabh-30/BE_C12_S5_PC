package org.niit.BE_C12_S5_PC.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    private String movieName;
    private String actorName;
    private String directorName;
   @Id
    private int movieId;

    public Movie() {
    }

    public Movie(String movieName, String actorName, String directorName, int movieId) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.directorName = directorName;
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", movieId=" + movieId +
                '}';
    }
}
