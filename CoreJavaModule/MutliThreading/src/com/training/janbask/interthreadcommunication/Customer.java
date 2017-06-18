package com.training.janbask.interthreadcommunication;

public class Customer {
	
	private int amount = 1000;
	
	public synchronized void withdrawn(int amount){
		if(this.amount < amount){
			try {
				System.out.println("Unable to withdrawn due to insufficent balance ");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Amount withdrawn successfully !!! Transaction completed");
	}
	
	public synchronized void deposit(int amount){
		this.amount += amount;
		System.out.println("Amount deposited successfully !!!");
		notify();
	}

}
