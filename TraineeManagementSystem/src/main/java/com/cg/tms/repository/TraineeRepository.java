package com.cg.tms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.tms.entity.Trainee;
@Repository
public interface TraineeRepository extends CrudRepository<Trainee,Integer>{

	Trainee findByTraineeId(int traineeId);
	Trainee findByTraineeName(String traineeName);
}
