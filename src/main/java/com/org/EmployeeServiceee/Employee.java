package com.org.EmployeeServiceee;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Service")
public class Employee {
	@Id
	@Column(name="EmployeeId")
	private long EmpId;
	
	@Column(name="Forename")
	private String Forename;
	
	@Column(name="Surname")
	private String Surname;
	
	@Column(name="EmpAge")
	private int Age;
	
	@Column(name="Company")
	private String Company;
	
	@Column(name="Postcode")
	private long Postcode;
	
	public Employee() {}
	
	
	public Employee(long empId, String forename, String surname, int age, String company, long postcode) {
		super();
		EmpId = empId;
		Forename = forename;
		Surname = surname;
		Age = age;
		Company = company;
		Postcode = postcode;
	}
	public long getEmpId() {
		return EmpId;
	}
	public void setEmpId(long empId) {
		EmpId = empId;
	}
	public String getForename() {
		return Forename;
	}
	public void setForename(String forename) {
		Forename = forename;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public long getPostcode() {
		return Postcode;
	}
	public void setPostcode(long postcode) {
		Postcode = postcode;
	}
	

}

