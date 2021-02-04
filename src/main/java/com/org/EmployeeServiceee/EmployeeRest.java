package com.org.EmployeeServiceee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeRest {
	@Autowired
	private EmployeeService eservice;
	@GetMapping("/Allemployees")
	public ResponseEntity<Object> getEmployees(){
		return new ResponseEntity<Object>(eservice.getAllEmployees(),HttpStatus.OK);
	}
	@GetMapping("employees/{id}")
	public ResponseEntity<Employee> getById(@PathVariable long id){
		return new ResponseEntity<Employee>(eservice.getEmployeeById(id),HttpStatus.FOUND);
	}
	@PostMapping("/addEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp){
		eservice.saveEmployee(emp);
		return new ResponseEntity<Object>("Created Successfully",HttpStatus.CREATED);
	}
	@DeleteMapping("/DeleteEmployee/{id}")
	public ResponseEntity<Object> DeleteById(@PathVariable long id){
		eservice.DeleteById(id);
		return new ResponseEntity<Object>("Deleted Successfully",HttpStatus.OK);
	}
	@PutMapping("/UploadEmployee")
	public ResponseEntity<Object> uploadEmp(@RequestBody Employee emp){
		eservice.UploadEmployee(emp);
		return new ResponseEntity<Object>("Updated Suucessfully",HttpStatus.OK);
	}

}
