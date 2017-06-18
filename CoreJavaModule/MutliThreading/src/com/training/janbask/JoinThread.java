package com.training.janbask;

public class JoinThread extends Thread{

	@Override
	public void run(){
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(" 5 * " + i + " = " + (5 * i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinThread j1 = new JoinThread();
		JoinThread j2 = new JoinThread();
		JoinThread j3 = new JoinThread();
		
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j2.start();
		try {
			j2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j3.start();
		
	}

}
