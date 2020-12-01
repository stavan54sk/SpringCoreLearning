package com.testpackage.test;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.bean.User;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"\\com\\testpackage\\config\\applicationContext.xml");
		User user1 = (User) ap.getBean("user");
		User user2 = (User) ap.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
		
		Runnable runnable = () -> { 
			User user3 = (User) ap.getBean("user");
			User user4 = (User) ap.getBean("user");
			System.out.println(user3);
			System.out.println(user4);
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Runnable runnable1 = () -> { 
			User user5 = (User) ap.getBean("user");
			User user6 = (User) ap.getBean("user");
			System.out.println(user5);
			System.out.println(user6);
		};
		Thread t2 = new Thread(runnable1);
		t2.start();

	}

}
