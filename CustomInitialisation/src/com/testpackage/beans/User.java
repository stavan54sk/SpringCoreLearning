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
		System.out.println(desc);
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println(password);
	}
	

	
	public  void init() {
		// TODO Auto-generated method stub
		
		System.out.println("Init");
		name="INTNAME";
		password="INTPASSWORD";
		desc="INTDESC";

	}
	
	private void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+password+desc;
	}
}