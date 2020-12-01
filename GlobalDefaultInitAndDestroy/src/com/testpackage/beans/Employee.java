package com.testpackage.beans;

public class Employee {

	String firstName;

	String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println(firstName);
		System.out.println("setFirstName");
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println(lastName);
		System.out.println("setLastName");
	}

	public void init() {
		firstName="GLOBALFIRSTNAME";
		lastName="GLOBALLASTNAME";
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+lastName;
	}
}
