package com.testpackage.beans;

public class Person {

	String name;

	String age;

	String gender;

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
		return name+age+gender;
		
	}

}
