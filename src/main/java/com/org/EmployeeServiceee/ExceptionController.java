package com.org.EmployeeServiceee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> exception (RecordNotFoundException ex){
		return new ResponseEntity<String>("Record not found",HttpStatus.NOT_FOUND);
	}
	

}
