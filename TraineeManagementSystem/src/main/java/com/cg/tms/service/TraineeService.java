package com.cg.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.entity.Trainee;
import com.cg.tms.repository.TraineeRepository;

@Service
public class TraineeService {
	@Autowired
	private TraineeRepository traineeRepository;
	
	public Trainee saveTrainee(Trainee trainee) {		
		
			return traineeRepository.save(trainee);
		
	}	
		
	public void deleteTrainee(int traineeId) {

		traineeRepository.deleteById(traineeId);
	}
			
	public Trainee updateTrainee(Trainee trainee) { 
		return traineeRepository.save(trainee);

	}

		 
	public Iterable<Trainee> listAllTrainees(){
		return traineeRepository.findAll(); 
	}
				
	public Trainee listTraineeByName(String traineeName){ 
		return traineeRepository.findByTraineeName(traineeName);
	} 
	
	public Trainee listTraineeById(int traineeId)
	{  
		Trainee trainee=traineeRepository.findByTraineeId(traineeId);
		return trainee;
	}

}
