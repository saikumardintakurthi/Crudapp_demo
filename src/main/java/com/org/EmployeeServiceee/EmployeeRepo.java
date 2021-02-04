package com.org.EmployeeServiceee;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import Employeeservice.EmployeeService.Employee;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Long> {
	

}
