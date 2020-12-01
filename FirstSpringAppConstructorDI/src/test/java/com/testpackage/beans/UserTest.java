package com.testpackage.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("\\com\\testpackage\\beans\\applicationContext.xml");
		
		User user=(User)applicationContext.getBean("user");
		
		System.out.println(user.name);
		
		System.out.println(user.age);
	}

}
