package com.testpackage.beans;

public class Account {

	String accounttype;
	
	String accountnumber;
	
	String accountholder;

	public Account(String accounttype, String accountnumber, String accountholder) {
		super();
		this.accounttype = accounttype;
		this.accountnumber = accountnumber;
		this.accountholder = accountholder;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accounttype+accountnumber+accountholder;
	}

}
