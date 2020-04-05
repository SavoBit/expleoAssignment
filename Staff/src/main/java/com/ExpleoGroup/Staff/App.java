package com.ExpleoGroup.Staff;

import java.util.Date;

import com.ExpleoGroup.Staff.DAOLayer.EmployeeService;
import com.ExpleoGroup.Staff.Entities.Company;
import com.ExpleoGroup.Staff.Entities.HREmployee;
import com.ExpleoGroup.Staff.Entities.QAEmployee;
import com.ExpleoGroup.Staff.Entities.QEEmployee;
import com.ExpleoGroup.Staff.EntityFactories.SimpleExpleoEmployeeFactory;
import com.ExpleoGroup.Staff.Types.IEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static EmployeeService employeeService = new EmployeeService();
	
	// Build Company using the builder Design pattern...
	public static Company insertCompany() {
		return new Company.Builder()
						  .setName("Expleo")
						  .setLocation("Egypt")
						  .setRegisterNo(1234)
						  .setTotalResourcesCount(220)
						  .build();
	}
	
	// Get HR Employee using the Factory Design Pattern implemented by SimpleEmployeeFactory class..
	public static IEmployee getHREmployee() {
		
		SimpleExpleoEmployeeFactory employeeFactory = new SimpleExpleoEmployeeFactory();
		
		IEmployee HREmp = null;
			try {
				HREmp = employeeFactory.getEmployee("HR");
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		return HREmp;
 }
	
	public static void displayCompanyInfoAsString() {
    	// First we create the company...
    	Company expleo = insertCompany();
    	System.out.println(expleo.toString());
    	
	}
	
	public static void displayHREmployeeWorkflow() {
		System.out.println("HR Workflow begins...\n");
	   	HREmployee hr = (HREmployee) getHREmployee();
    	hr.setFirstname("Mohamed");
    	hr.setLastname("AbdelHamid");
    	hr.signIn(new Date());

    	// The HR screens candidates....
    	hr.screen();
    	// if the candidate passed, then he get hired and added to the company database...
    	hr.hire(new QAEmployee("Mahmoud", "Mosalam", new Date(), 11));
    	hr.hire(new QEEmployee("Mahmoud", "Hashish", new Date(), 2, 10));
     	hr.signOut(new Date());
    	// display HR Employee properties...
    	System.out.println(hr.toString());
    	
		System.out.println("HR Workflow ended........\n");

	}
	
	public static void displayQAEmployeeWorkflow() {
		System.out.println("QA Workflow begins....\n");

		// Get QA Employee from db...
    	QAEmployee qa = (QAEmployee) employeeService.getEmployeeByDepartmentAndLastName("QA", "Mosalam");
	 	// QA has come to work...
    	qa.signIn(new Date());
    	// QA got assigned to projects...
    	qa.assignToProject("AllianzNow");
    	// QA has started executing tests...
    	qa.executeTests();
    	// QA is going home...
    	qa.signOut(new Date());
    	// Display QA properties as string...
    	System.out.println(qa.toString());
    	
		System.out.println("QA Workflow ended....\n");

	}
	
	public static void displayQEEmployeeWorkflow() {
		System.out.println("QE Workflow begins....\n");
    	QEEmployee qe= (QEEmployee) employeeService.getEmployeeByDepartmentAndLastName("QE", "Hashish");
		qe.setIsCareerManager(true);
    	qe.assignToProject("Bentley");
    	qe.signIn(new Date());
    	qe.executeTests();
    	qe.reviewTestExecution();
    	System.out.println(qe.sendExecutionReport());
    	qe.signOut(new Date());
    	System.out.println(qe.toString());
		System.out.println("QE Workflow ended....\n");
	}
	
    public static void main( String[] args )
    {
    	// display company properties...
    	displayCompanyInfoAsString();
    	
    	// Then we hire an HR personal...
    	displayHREmployeeWorkflow();
    	
    	// display QA Employee workflow....
    	displayQAEmployeeWorkflow();
    	
    	// display QA Employee workflow....
    	displayQEEmployeeWorkflow();

    	
    }
}
