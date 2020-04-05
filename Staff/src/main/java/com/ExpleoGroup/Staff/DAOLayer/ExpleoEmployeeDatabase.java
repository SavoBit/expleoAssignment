package com.ExpleoGroup.Staff.DAOLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ExpleoGroup.Staff.Entities.Employee;
import com.ExpleoGroup.Staff.Types.Connection;

public class ExpleoEmployeeDatabase implements Connection {

	private Map<String, List<Employee>> employeeDB;
	private static ExpleoEmployeeDatabase instance;
	
	public static ExpleoEmployeeDatabase getInstance() {
		if(instance != null) {
			return instance;
		}else {
			instance = new ExpleoEmployeeDatabase();
			return instance;
		}
	}
	
	private ExpleoEmployeeDatabase() {
		this.employeeDB = new HashMap<String, List<Employee>>();
	}
	
	public Map<String, List<Employee>> connect(){
		return this.employeeDB;
	}
	
	public void addDepartment(String dep) throws Exception{
		if(this.employeeDB.get(dep) != null) {
			throw new Exception("Table " + dep + " " + "already exists");
		}else {
			this.employeeDB.put(dep, new ArrayList<Employee>());
		}
		
	}
	
	public Boolean addEmployee(String dep, Employee e){
		
		if(this.employeeDB.get(dep) != null) {
			this.employeeDB.get(dep).add(e);
		}else {
			List<Employee> employees = new ArrayList<Employee>();
			employees.add(e);
			this.employeeDB.put(dep, employees);
		}
		return true;
	}
	
	

}
