package com.zak.srp.example.change.bad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Employee {
	
	private String name;
	private Long empId;
	private Map<Date,Integer> workingHours;
	private Double hourlyPay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Map<Date, Integer> getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Map<Date, Integer> workingHours) {
		this.workingHours = workingHours;
	}

	public Double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(Double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	//Return the total working hour upto two decimal places
	public String getTotalWorkingHour(){
		return null;
	}
	
	public void save(){
		//Code to save the employee in database
	}
	
	
	public Employee findById(){
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
	
	
	//needs the total working hour upto three decimal places 
	//in order to calculate correct payment
	public double calculatePay(){
		//code to calculate the payment to employee;
		//apart from other info also uses the working hours map and hourly pay to calculate pay
		this.getTotalWorkingHour(); //makes use of this method in order to calculate
		return 0.0;
	}
	
	//Gives report about an employee in one format
	public String report1(){
		//code to get the report in format 1
		//apart from other info also uses the working hours map and hourly pay to  generate report
		return null;
	}
	
	//Because of change client also needs report in another format ,gives report about an employee in one more format
	public String report2(){
		//code to get the report in format 2
		//apart from other info also uses the working hours map and hourly pay to  generate report
		return null;
	}
	
	//This method is added in order to incorporate the new functionality for 
	//finding an employee by name
	public Employee findByName(){
		//code to find an employee in database by their name
		return null;
	}

	public String report3() {
		//code to get the report in format 3
		//apart from other info also uses the working hours map and hourly pay to  generate report

		return null;
	}
}
