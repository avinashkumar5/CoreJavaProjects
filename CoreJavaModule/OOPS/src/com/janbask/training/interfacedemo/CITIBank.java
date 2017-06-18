package com.janbask.training.interfacedemo;

public class CITIBank implements BankAccount, GlobalTransfer {

	@Override
	public int transfer(String transferType) {
		System.out.println("Saving Account CITI ROI is 3 %" + transferType);
		return 10;
	}

	@Override
	public void roiSavingAccount() {
		System.out.println("Saving Account CITI ROI is 3 %");
	}

	@Override
	public void roiCurrentAccount() {
		System.out.println("Current Account CITI ROI is 10 %");
	}

	@Override
	public void roiFixedDeposit() {
		System.out.println("Fixed Deposit CITI ROI is 30 %");
	}

}
