package com.testpackage.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testpackage.beans.User;
import com.testpackage.config.TestConfig;


public class TestClient {
	
	public static void main(String[] args) {

		ApplicationContext applicationConfig= new AnnotationConfigApplicationContext(TestConfig.class);
		
		System.out.println(applicationConfig.getBean("getPerson"));
		
		System.out.println(applicationConfig.getBean(User.class));
	}

}
