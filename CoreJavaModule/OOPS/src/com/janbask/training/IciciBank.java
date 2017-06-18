package com.janbask.training;

public class IciciBank extends SavingAccount {

	public int getRateOfInt(){
		return 10;
	}
	
	public String getBankName(){
		System.out.println("Account type :: " + super.getAccountType());
		return "ICICI Bank";
	}

}
