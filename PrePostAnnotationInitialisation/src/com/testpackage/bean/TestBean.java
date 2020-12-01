package com.testpackage.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean  {
	String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println(beanName);
	}

	
	
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("@PreDestroy");

	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("@PostConstruct");
		beanName="INITTESTBEAN";
		System.out.println(beanName);
	}

	@Override
	public String toString() {
		return null;
		// TODO Auto-generated method stub
//		return beanName;
	}
}
