package com.ExpleoGroup.Staff.EntityFactories;

import com.ExpleoGroup.Staff.Entities.Employee;
import com.ExpleoGroup.Staff.Entities.HREmployee;
import com.ExpleoGroup.Staff.Entities.QAEmployee;
import com.ExpleoGroup.Staff.Entities.QEEmployee;


/*
 * 
 Provide different employee instances using Java Factory Design Pattern...
 
 */

public class SimpleExpleoEmployeeFactory {

	public SimpleExpleoEmployeeFactory() {
	}
	
	public Employee getEmployee(String employeeType) throws Exception{
		
		Employee emp = null;
		
		switch(employeeType) {
			case "QA":
				emp = new QAEmployee();
				break;
			case "QE":
				emp = new QEEmployee();
				break;
			case "HR":
				emp = new HREmployee();
				break;
			default:
				throw new Exception("Employee instance is invalid");
				
		}
		
		return emp;
	}
	
	public EmployeeDIProvider getDIProvider() {
		return new EmployeeDIProvider();
	}


}
