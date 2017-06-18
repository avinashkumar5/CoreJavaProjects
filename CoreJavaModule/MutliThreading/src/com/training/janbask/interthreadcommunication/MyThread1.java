package com.training.janbask.interthreadcommunication;

public class MyThread1 extends Thread{

	private Customer c;
	
	public MyThread1(Customer c){
	   this.c = c; 	
	}
	
	@Override
	public void run(){
		c.withdrawn(1500);
	}
}
