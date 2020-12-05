package com.cg.tms.exception;

public class TraineeNameException extends RuntimeException{
	public TraineeNameException() {
		super();
	} 
	public TraineeNameException(String errorMsg) {
		super(errorMsg);
	}

}
