package com.testpackage.beans;

import java.util.Map;
import java.util.Properties;

public class Account {

	Map accounttype;
	
	Properties accountnumbers;
	
	String accountholder;

	public Account(Map accounttype, Properties accountnumbers, String accountholder) {
		super();
		this.accounttype = accounttype;
		this.accountnumbers = accountnumbers;
		this.accountholder = accountholder;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accounttype+accountnumbers.toString()+accountholder;
	}

}
