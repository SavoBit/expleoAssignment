package com.ExpleoGroup.Staff.Types;

import java.util.List;
import java.util.Map;

import com.ExpleoGroup.Staff.Entities.Employee;

public interface Connection {
	
	Map<String, List<Employee>> connect();
	

}
