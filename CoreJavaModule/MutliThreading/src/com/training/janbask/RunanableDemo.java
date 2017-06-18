package com.training.janbask;

public class RunanableDemo {

	public static void main(String[] args) {

		ThreadRunnable t = new ThreadRunnable();
		
		Thread t1 = new Thread(t);
		
		t1.start();
	}

}
