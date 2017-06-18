package com.training.janbask.interthreadcommunication;

public class InterThreadCommDemo {

	public static void main(String[] args) {
 
		Customer c = new Customer();
		
		MyThread1 t1 = new MyThread1(c); //passing the common Customer OBJ
		MyThread2 t2 = new MyThread2(c); //passing the common Customer OBJ
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
	/*	new Thread(){
			public void run(){
				c.withdrawn(1500);
			}
		}.start();
		
		new Thread(){
			public void run(){
				c.deposit(1000);
			}
		}.start();*/
	}

}
