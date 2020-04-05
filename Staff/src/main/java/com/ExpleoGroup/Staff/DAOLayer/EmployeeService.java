package com.ExpleoGroup.Staff.DAOLayer;

import java.util.List;
import java.util.stream.Collectors;

import com.ExpleoGroup.Staff.Entities.Employee;
import com.ExpleoGroup.Staff.EntityFactories.EmployeeDIProvider;
import com.ExpleoGroup.Staff.Types.Connection;

public class EmployeeService {

	private Connection db = new EmployeeDIProvider().getExpleoDBInstance();

	
	public EmployeeService() {
	}
	
	public Employee getEmployeeByDepartmentAndLastName(String dep, String lastname) {
		Employee emp = null;
		List<Employee> employees = db.connect().get(dep);
		emp = (Employee) employees.stream().filter(employee -> employee.getLastname().equals(lastname)).collect(Collectors.toList()).get(0);
		return emp;
		
	}

}
