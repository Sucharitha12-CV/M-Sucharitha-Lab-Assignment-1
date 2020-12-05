package com.cg.ma.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ma.entity.Movie;

@Repository
public interface IMovieRepository extends CrudRepository<Movie,Integer>{
	
	Movie findByMovieName(String movieName);
}
