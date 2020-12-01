package com.testpackage.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.beans.Account;
import com.testpackage.beans.Person;


public class TestClient {
	
	public static void main(String[] args) {

		ApplicationContext applicationConfig= new ClassPathXmlApplicationContext("\\com\\testpackage\\config\\applicationContext.xml");
		
		System.out.println(applicationConfig.getBean(Person.class));
		
		System.out.println(applicationConfig.getBean(Account.class));
	}

}
