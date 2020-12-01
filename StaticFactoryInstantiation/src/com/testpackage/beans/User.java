package com.testpackage.beans;

public class User {

	String name;

	String password;

	String desc;

	public String getDesc() {
		return desc;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private static User getInstance() {
		User u=new User();
		u.setDesc("TestDesc");
		u.setName("TestUser");
		u.setPassword("TestPassword");
		return u;
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+password+desc;
	}
}
