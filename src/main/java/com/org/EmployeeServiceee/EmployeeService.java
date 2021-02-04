package com.org.EmployeeServiceee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo emprepo;
	
	
	public List<Employee> getAllEmployees(){
		List<Employee> al = new ArrayList<>();
		emprepo.findAll().forEach(a->al.add(a));
		return al;
	}
	public void saveEmployee(Employee emp)  {
		this.emprepo.save(emp);
	}
	public Employee getEmployeeById(long id) {
		Optional<Employee> emp = emprepo.findById(id);
		if(emp.isPresent()) return emp.get();
		else 
			throw new RecordNotFoundException();
	}
	public void DeleteById(long id) {
		if(emprepo.existsById(id)) {
			emprepo.deleteById(id);
		}
		else 
			throw new RecordNotFoundException();
		
	}
	public Employee UploadEmployee(Employee obj) {
		Optional<Employee> emp = emprepo.findById(obj.getEmpId());
		if(emp.isPresent()) {
			Employee em = emp.get();
			em.setEmpId(obj.getEmpId());
			em.setForename(obj.getForename());
			em.setSurname(obj.getSurname());
			em.setAge(obj.getAge());
			em.setCompany(obj.getCompany());
			em.setPostcode(obj.getPostcode());
			em = emprepo.save(em);
			return em;
		}
		else
			throw new RecordNotFoundException();
	}
}
