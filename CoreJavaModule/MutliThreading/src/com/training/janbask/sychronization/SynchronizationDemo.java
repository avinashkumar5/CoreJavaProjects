package com.training.janbask.sychronization;

public class SynchronizationDemo {

	public static void main(String[] args) {

		TableResource t = new TableResource(); //common resource object
		
		MyThread1 t1 = new MyThread1(t); //pass the same common resource
		MyThread2 t2 = new MyThread2(t); //pass the same common resource
		
		t1.start();
		t2.start();
		
	}

}
