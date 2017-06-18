package com.janbask.training.interfacedemo;

public class HSBCBank implements BankAccount, GlobalTransfer{

	@Override
	public void roiSavingAccount() {
		System.out.println("Saving Account HSBC ROI is 3.5 %");	
	}

	@Override
	public void roiCurrentAccount() {
		System.out.println("Current Account HSBC ROI is 10 %");
	}

	@Override
	public void roiFixedDeposit() {
		System.out.println("Fixed Deposit Account HSBC is 7 %");
	}

	@Override
	public int transfer(String transferType) {
        System.out.println("Transfer rate is 20 " + transferType);
        return 20;
	}

}
