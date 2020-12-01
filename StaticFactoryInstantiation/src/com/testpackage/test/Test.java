package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.beans.User;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("\\com\\testpackage\\config\\applicationcontext.xml");
		
		
		User user=(User)applicationcontext.getBean("user");
		
		System.out.println(user);
	}

}
