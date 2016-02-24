package com.zak.srp.example.change.bad;

import java.util.List;

public class EmployeeBusinessService {
	 
	
	public void updateEmployeesName(Employee employee){
				if(null!=employee){
					Employee dbEmp=employee.findById();
					dbEmp.setName(employee.getName());
					dbEmp.save();
				}

	}
	
	public void updateEmployeePenalty(Employee employee){
		List<Employee> empList=employee.findByTotalWorkingHour(50L);
		if(null!=empList && !empList.isEmpty()){
			for(Employee e: empList){
				if(null!=e){
					e.setHourlyPay(e.getHourlyPay()-10);
					e.save();
				}
			}
		}
	}
}
