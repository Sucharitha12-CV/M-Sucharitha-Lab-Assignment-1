package com.cg.ma.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ma.entity.Movie;
import com.cg.ma.repository.IMovieRepository; 
@Service
public class MovieService {
	@Autowired
	private IMovieRepository movieRepository;
	
	public Movie saveMovie(Movie movie) {		
		
			return movieRepository.save(movie);
		
	}	
		
	public void deleteMovie(int movieId) {

		movieRepository.deleteById(movieId);
	}
			
	public Movie updateMovie(Movie movie) { 
		return movieRepository.save(movie);

	}

		 
	public Iterable<Movie> listAllMovies(){
		return movieRepository.findAll(); 
	}
				
	public Movie listMovieByName(String movieName){ 
		return movieRepository.findByMovieName(movieName);
	} 
	

}
