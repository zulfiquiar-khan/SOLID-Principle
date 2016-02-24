package com.zak.ocp.example.good;

import java.util.ArrayList;
import java.util.List;



public class ReporterBusinessService {
	
	private EmployeeReporteGenerator eReportGenerator=new EmployeeReportGeneratorFormat1();
	
	List<String> generateReportType(List<Employee> employees){
		List<String> report=new ArrayList<>();
		if(null!=employees && !employees.isEmpty()){
			for(Employee e : employees){
				report.add(eReportGenerator.report(e));
			}
		}
		
		return report;
	}
}
