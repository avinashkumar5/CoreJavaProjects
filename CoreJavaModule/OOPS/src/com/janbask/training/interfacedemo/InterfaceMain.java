package com.janbask.training.interfacedemo;

public class InterfaceMain {

	public static void main(String[] args) {

		BankAccount hsbc = new HSBCBank();
		hsbc.roiCurrentAccount();
		
		hsbc.roiFixedDeposit();
		
		hsbc.roiSavingAccount();
		
		GlobalTransfer hsbcTransfer = new HSBCBank();
		System.out.println(hsbcTransfer.transfer("Global"));
		
		
	}

}
