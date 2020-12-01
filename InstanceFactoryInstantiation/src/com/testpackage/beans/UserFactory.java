package com.testpackage.beans;

public class UserFactory {
	
	private User getInstance() {
		// TODO Auto-generated method stub
		User u=new User();
		u.setDesc("TestDesc");
		u.setName("TestUser");
		u.setPassword("TestPassword");
		return u;
	}

}
