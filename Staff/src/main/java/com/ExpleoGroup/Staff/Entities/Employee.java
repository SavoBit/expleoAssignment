package com.ExpleoGroup.Staff.Entities;

import java.util.Date;

import com.ExpleoGroup.Staff.Types.IEmployee;

public class Employee implements IEmployee{

	private String firstname;
	private String lastname;
	private Date hiringDate;
	private Boolean isResigned;
	private Date lastSignedIn;
	private Date lastSignedOut;
	
	// Default Constructor
	public Employee() {
	}

	// Parameterised Constructor
	public Employee(String firstname, String lastname, Date hiringDate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.hiringDate = hiringDate;
		this.isResigned = false;
	}


	public Date getLastSignedIn() {
		return lastSignedIn;
	}

	public Date getLastSignedOut() {
		return lastSignedOut;
	}

	public void signIn(Date signInDate) {
		this.lastSignedIn = signInDate;
		System.out.println("Employee signed in on " + this.lastSignedIn.toString());
 
	}

	public void signOut(Date signOutDate) {
		this.lastSignedOut = signOutDate;
		System.out.println("Employee signed out on " + this.lastSignedOut.toString());

	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Date getHiringDate() {
		return hiringDate;
	}


	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}


	public Boolean getIsResigned() {
		return isResigned;
	}


	public void setIsResigned(Boolean isResigned) {
		this.isResigned = isResigned;
	}


	public Boolean resign() {
		// TODO Auto-generated method stub
		return null;
	}

}
