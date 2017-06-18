package com.janbask.training;

public class SavingAccount {
	
	public SavingAccount(){
		System.out.println("Inside parent Saving Account");
	}
	
	public int getRateOfInt(){
		return 5;
	}
	
	public String getAccountType(){
		return "SavingAccount";
	}
	
	protected String getBankName(){
		return "GLOBAL BANK";
	}

}
