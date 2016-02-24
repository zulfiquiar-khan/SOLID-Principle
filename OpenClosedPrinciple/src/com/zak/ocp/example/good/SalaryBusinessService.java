package com.zak.ocp.example.good;

import java.util.ArrayList;
import java.util.List;


public class SalaryBusinessService {
	
	private PaymentCalculator ePaymentCalculator=new ManagerPaymentCalculator();

	public List<Double> getPayOfEmployees(List<Employee> employees){
		List<Double> payList=new ArrayList<>();
		if(null!=employees && !employees.isEmpty()){
			for(Employee e: employees){
				payList.add(ePaymentCalculator.calculatePay(e));
			}
		}
		return payList;
	}
}
