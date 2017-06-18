package com.training.janbask;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {

		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(" 5 * " + i + " = " + (5 * i));
		}
	}


}
