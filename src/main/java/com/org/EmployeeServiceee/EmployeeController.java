package com.org.EmployeeServiceee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/employees")
	public String getAllEmployees(Model model) {
		model.addAttribute("EmployeeList",empservice.getAllEmployees());	
	return "index";	
	}
	@GetMapping("/addEmployee")
	public String addemployee(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "NewEmployee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		empservice.saveEmployee(emp);
		return "redirect:/employees";
	}

}
