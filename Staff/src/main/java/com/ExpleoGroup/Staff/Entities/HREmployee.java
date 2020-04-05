package com.ExpleoGroup.Staff.Entities;


import java.util.List;
import java.util.Map;

import com.ExpleoGroup.Staff.DAOLayer.ExpleoEmployeeDatabase;
import com.ExpleoGroup.Staff.EntityFactories.EmployeeDIProvider;
import com.ExpleoGroup.Staff.Types.IHREmployee;

public class HREmployee extends Employee implements IHREmployee{

	private EmployeeDIProvider employeeProvider = new EmployeeDIProvider();
	
	public HREmployee() {
	}

	@Override
	public void hire(QAEmployee employee) {
		System.out.println("Candidate" + " " + employee.getLastname() + " is accepted by the HR Employee as QA Employee and will be hired....");
		ExpleoEmployeeDatabase conn = (ExpleoEmployeeDatabase) this.employeeProvider.getExpleoDBInstance();
		try {
			conn.addDepartment("QA");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, List<Employee>> db = conn.connect();
		db.get("QA").add(employee);
	}

	
	@Override
	public void hire(QEEmployee employee) {
		System.out.println("Candidate" + " " + employee.getLastname() + " is accepted by the HR Employee as QE Employee and will be hired....");
		ExpleoEmployeeDatabase conn = (ExpleoEmployeeDatabase) this.employeeProvider.getExpleoDBInstance();
		try {
			conn.addDepartment("QE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, List<Employee>> db = conn.connect();
		
		db.get("QE").add(employee);
		
	}
	
	
	@Override
	public void screen() {
		System.out.println("HR Employee is now screening with a candidate.....");
	}

	@Override
	public String toString() {
		return "HREmployee [Last Signed In: " + getLastSignedIn() + ", Last Signed Out: " + getLastSignedOut()
				+ ", Firstname: " + getFirstname() + ", Lastname: " + getLastname() + ", Hiring-Date: "
				+ getHiringDate() + ", IsResigned: " + getIsResigned() + "]";
	}



}
