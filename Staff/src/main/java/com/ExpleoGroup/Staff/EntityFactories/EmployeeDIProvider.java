package com.ExpleoGroup.Staff.EntityFactories;

import com.ExpleoGroup.Staff.DAOLayer.ExpleoEmployeeDatabase;
import com.ExpleoGroup.Staff.Entities.HREmployee;
import com.ExpleoGroup.Staff.Entities.QAEmployee;
import com.ExpleoGroup.Staff.Entities.QEEmployee;
import com.ExpleoGroup.Staff.Types.Connection;


/*
 * Dependency Injection Provider */
public class EmployeeDIProvider {

	public EmployeeDIProvider() {
	}
	
	public QAEmployee getQAEmployeeInstance() {
		return new QAEmployee();
	}

	public QEEmployee getQEEmployeeInstance() {
		return new QEEmployee();
	}
	
	public HREmployee getHREmployeeInstance() {
		return new HREmployee();
	}
	
	public Connection getExpleoDBInstance() {
		return ExpleoEmployeeDatabase.getInstance();
	}
	
	
}
