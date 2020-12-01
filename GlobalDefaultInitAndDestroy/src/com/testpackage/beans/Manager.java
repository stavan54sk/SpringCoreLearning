package com.testpackage.beans;

public class Manager {

	String project;
	
	public void setProject(String project) {
		this.project = project;
		System.out.println("setProject");
		System.out.println(project);
	}
	
	public String getProject() {
		return project;
	}

	public void init() {
		project="GLOBALPROJECT";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return project;
	}

}
