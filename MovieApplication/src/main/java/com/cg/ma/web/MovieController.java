package com.cg.ma.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ma.entity.Movie;
import com.cg.ma.service.MapValidationErrorService;
import com.cg.ma.service.MovieService;



@RestController
public class MovieController {
	@Autowired
	MovieService movieService;
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@PostMapping("/Movie")
	public ResponseEntity<?> saveMovie(@Valid @RequestBody Movie movie, BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationService(result);
		if(errorMap!=null) {
			return errorMap;
		}
		Movie newMovie=movieService.saveMovie(movie);
		return new ResponseEntity<Movie>(newMovie, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{movieId}")
	public ResponseEntity<String> deleteTrainee(@PathVariable int movieId){		  
	movieService.deleteMovie(movieId); 
	return new ResponseEntity<String>("Movie with Id : "+movieId+" Deleted!",HttpStatus.OK);
	}
	@PutMapping("/Movie/{movieId}")
    public ResponseEntity<String> update( @RequestBody Movie movie) {
    movieService.updateMovie(movie); 
	return new ResponseEntity<String>("Movie  Updated!",HttpStatus.OK);
	}
	@GetMapping("/Movie/{movieName}")
	public ResponseEntity<?> listMovieByName(@PathVariable String movieName){
		return new ResponseEntity<Movie>(movieService.listMovieByName(movieName),HttpStatus.OK);
	}
	@GetMapping("/all")
	public Iterable<Movie> listAllMovies(){
		return movieService.listAllMovies();
	}

}
