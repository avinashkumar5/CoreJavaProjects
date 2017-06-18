package com.janbask.training;

public class SBIAccount extends SavingAccount {
	
	@Override
	public int getRateOfInt(){
		return 10;
	}
	
	public SBIAccount(){
		super();
		System.out.println("SBI Account");
	}
	
	@Override
	public String getBankName(){
		System.out.println("Account type :: " + super.getAccountType());
		return "State of India";
	}

}
