package com.testpackage.beans;

public class Lead {

	String team;
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
		System.out.println("setTeam");
		System.out.println(team);
	}

	public void init() {
		team="GLOBALTEAM";
	}

	@Override
	public String toString() {
		return team;	
	}
	
}
