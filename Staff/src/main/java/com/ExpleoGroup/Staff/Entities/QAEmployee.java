package com.ExpleoGroup.Staff.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ExpleoGroup.Staff.Types.IQAEmployee;

public class QAEmployee extends Employee implements IQAEmployee{
	
	private List<String> assignedProjects;
	private int teamNumber;
	
	public QAEmployee() {
	}
	
	public QAEmployee(String firstname, String lastname, Date hiringDate, int teamNumber) {
		
		super(firstname, lastname, hiringDate);
		this.teamNumber = teamNumber;
		this.assignedProjects = new ArrayList<String>();
	}
	
	public List<String> getAssignedProjects() {
		return assignedProjects;
	}

	public void setAssignedProjects(List<String> assignedProjects) {
		this.assignedProjects = assignedProjects;
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	public void executeTests() {
		System.out.println("QA Employee started test-execution for project ....");
	}
	
	public void assignToProject(String project) {
		this.assignedProjects.add(project);

	}
	
	public void unassignFromProject(String project) {
		this.assignedProjects.remove(project);
	}

	public void displayAssignedProjects() {
		this.assignedProjects.forEach( project -> System.out.println(project + ", "));
	}

	@Override
	public String toString() {
		return "QAEmployee [assignedProjects: " 
				+ getAssignedProjects() + ", Team: " + getTeamNumber()
				+ ", Last signed in: " + getLastSignedIn() + ", Last signed out: " + getLastSignedOut()
				+ ", Firstname: " + getFirstname() + ", Lastname: " + getLastname() + ", Hiring-Date: "
				+ getHiringDate() + ", isResigned: " + getIsResigned() + "]";
	}
	
	

}
