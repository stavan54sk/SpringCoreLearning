package com.testpackage.beans;

import org.springframework.core.style.ToStringCreator;

public class Person {

	String name;

	String age;

	String gender;
	
	Account account;
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name+age+gender+account;
			}

	

}
