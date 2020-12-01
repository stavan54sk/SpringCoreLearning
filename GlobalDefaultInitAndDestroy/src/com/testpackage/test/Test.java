package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.beans.Employee;
import com.testpackage.beans.Lead;
import com.testpackage.beans.Manager;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\testpackage\\resource\\applicationContext.xml");
		Employee employee=(Employee)ap.getBean("employee");
		Lead lead =(Lead)ap.getBean("lead");
		Manager manager=(Manager)ap.getBean("manager");
		
		System.out.println(employee);
		
		System.out.println(manager);
		
		System.out.println(lead);
	}
}
