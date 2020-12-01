package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.bean.TestBean;

public class Test {
	
public static void main(String[] args) {
	
	ApplicationContext ap= new ClassPathXmlApplicationContext("\\com\\testpackage\\config\\applicationContext.xml");
	System.out.println(ap.getBean(TestBean.class));
	
	
}

}
