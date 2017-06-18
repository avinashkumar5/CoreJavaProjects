package com.training.janbask;

public class SleepThread extends Thread{

	@Override
	public void run(){
		for(int i= 0 ; i < 3 ; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		SleepThread s1 = new SleepThread();
		SleepThread s2 = new SleepThread();
		
		s1.start();
		s2.start();
		
	}

}
