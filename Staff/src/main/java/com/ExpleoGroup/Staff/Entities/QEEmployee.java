package com.ExpleoGroup.Staff.Entities;

import java.util.Date;

import com.ExpleoGroup.Staff.Types.IQEEmployee;

public class QEEmployee extends QAEmployee implements IQEEmployee{

	private Boolean isCareerManager;
	private int countOfEmployeesReportingToHim;
	
	public QEEmployee() {
	}
	
	public QEEmployee(String firstname, String lastname, Date hiringDate, int teamNumber, int countOfEmployeesReportingToHim) {
		super(firstname, lastname, hiringDate, teamNumber);
		this.countOfEmployeesReportingToHim = countOfEmployeesReportingToHim;
	}
	
	public Boolean getIsCareerManager() {
		return isCareerManager;
	}

	public void setIsCareerManager(Boolean isCareerManager) {
		this.isCareerManager = isCareerManager;
	}

	public int getCountOfEmployeesReportingToHim() {
		return countOfEmployeesReportingToHim;
	}

	public void setCountOfEmployeesReportingToHim(int countOfEmployeesReportingToHim) {
		this.countOfEmployeesReportingToHim = countOfEmployeesReportingToHim;
	}

	@Override
	public void executeTests() {
		System.out.println("QE started executing testcases...");
	}

	@Override
	public void reviewTestExecution() {
		System.out.println("QE is now reviewing test execution of his colleagues....");
		
	}

	@Override
	public String sendExecutionReport() {
		return "Execution Report \n" + "Total TCs: 30, Passed: 18, Failed: 12";
	}

	@Override
	public String toString() {
		return "QEEmployee [isCareerManager: " + isCareerManager + ", countOfEmployeesReportingToHim: "
				+ countOfEmployeesReportingToHim + ", assigned Projects: " + getAssignedProjects()
				+ ", Team Number: " + getTeamNumber() + ", Last Signed In: " + getLastSignedIn()
				+ ", Last Signed Out: " + getLastSignedOut() + ", Firstname: " + getFirstname()
				+ ", Lastname :" + getLastname() + ", Hiring-Date: " + getHiringDate() + ", isResigned: "
				+ getIsResigned() + "]";
	}




	

}
