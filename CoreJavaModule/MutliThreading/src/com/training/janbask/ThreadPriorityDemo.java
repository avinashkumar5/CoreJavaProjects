package com.training.janbask;

public class ThreadPriorityDemo {

	public static void main(String[] args) {

		FirstThread t1 = new FirstThread();
		t1.setName("First thread");
		t1.setPriority(3);
		
		FirstThread t2 = new FirstThread();
		t2.setName("Second thread");
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}

}
