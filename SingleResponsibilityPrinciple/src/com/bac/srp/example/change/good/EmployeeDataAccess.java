package com.bac.srp.example.change.good;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataAccess {

	public void saveEmployee(Employee employee){
		//Code to save the employee in database
	}
	
	
	public Employee findById(Long empId){
		Employee emp=null;
		
		//code to get the employee from the database based on the employee id
		//uses this.empId to get the id of the employee and then fetches the 
		//employee details for the database
		
		return emp;
	}
	
	
	
	public List<Employee> findByTotalWorkingHour(long totalWorkingHour){
		List<Employee> employees=new ArrayList<>();
		//code to fetch all employees whose working hour is less than totalWorkingHour
		return employees;
	}

	
	//This method is added in order to incorporate the new functionality for 
	//finding an employee by name
	public Employee findByName(String Name){
		//code to find an employee in database by their name
		return null;
	}
}
