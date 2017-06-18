package com.janbask.training;

public class ThisAndSuperMain {

	public void call(){
		System.out.println("Inside main method");
	}
	
	public ThisAndSuperMain(){
		System.out.println("Constructor");
		this.call();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisAndSuperMain thisAndSuper = new ThisAndSuperMain();
		SavingAccount saIcici = new IciciBank();
		System.out.println("Rate of Interest of ICICI  " + saIcici.getRateOfInt() + " and the bank name :: " + saIcici.getBankName());

		SavingAccount saSbi = new SBIAccount();
		System.out.println("Rate of Interest of SBI " + saSbi.getRateOfInt() + " and the bank name :: " + saSbi.getBankName());

	}

}
