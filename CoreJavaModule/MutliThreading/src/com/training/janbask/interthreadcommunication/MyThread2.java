package com.training.janbask.interthreadcommunication;

public class MyThread2 extends Thread{

	private Customer c;
	
	public MyThread2(Customer c){
		this.c = c;
	}
	
	@Override
	public void run(){
		c.deposit(1000);
	}
}
