package com.testpackage.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements InitializingBean, DisposableBean {
	String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println(beanName);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DESTROY");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INIT");
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
