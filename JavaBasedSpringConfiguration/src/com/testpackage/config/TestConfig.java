package com.testpackage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testpackage.beans.Person;
import com.testpackage.beans.User;

@Configuration
public class TestConfig {
	
	
	@Bean
	public User getUser()
	{
		User u1=new User();
		u1.setName("TestUser");
		u1.setPassword("TestPassword");
		return u1;		
		
	}
	
	
	@Bean
	public Person getPerson()
	{
		Person p1 =new Person();
		p1.setAge("10");
		p1.setGender("Male");
		p1.setName("TestPerson");
		return p1;
		
	}
	

}
