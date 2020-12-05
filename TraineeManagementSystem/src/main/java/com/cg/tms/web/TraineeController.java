package com.cg.tms.web;

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

import com.cg.tms.entity.Trainee;
import com.cg.tms.service.MapValidationErrorService;
import com.cg.tms.service.TraineeService;

@RestController
public class TraineeController {
	@Autowired
	TraineeService traineeService;
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@PostMapping("/Trainee")
	public ResponseEntity<?> saveTrainee(@Valid @RequestBody Trainee trainee, BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationService(result);
		if(errorMap!=null) {
			return errorMap;
		}
		Trainee newTrainee=traineeService.saveTrainee(trainee);
		return new ResponseEntity<Trainee>(newTrainee, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{traineeId}")
	public ResponseEntity<String> deleteTrainee(@PathVariable int traineeId){		  
	traineeService.deleteTrainee(traineeId); 
	return new ResponseEntity<String>("Trainee with Id : "+traineeId+" Deleted!",HttpStatus.OK);
	}
	@PutMapping("/Trainee/{traineeId}")
    public ResponseEntity<String> update( @RequestBody Trainee trainee) {
    traineeService.updateTrainee(trainee); 
	return new ResponseEntity<String>("Trainee  Updated!",HttpStatus.OK);
	}
	@GetMapping("/{traineeId}")
	public ResponseEntity<?> listTraineeById(@PathVariable int traineeId){
		return new ResponseEntity<Trainee>(traineeService.listTraineeById(traineeId),HttpStatus.OK);
	}
	@GetMapping("/trainee/{traineeName}")
	public ResponseEntity<?> listTraineeByName(@PathVariable String traineeName){
		return new ResponseEntity<Trainee>(traineeService.listTraineeByName(traineeName),HttpStatus.OK);
	}
	@GetMapping("/all")
	public Iterable<Trainee> listAllTrainees(){
		return traineeService.listAllTrainees();
	}

}
