package org.niit.BE_C12_S5_PC.repository;

import org.niit.BE_C12_S5_PC.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {

}
