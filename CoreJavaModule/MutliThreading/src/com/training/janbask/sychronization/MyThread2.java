package com.training.janbask.sychronization;

public class MyThread2 extends Thread{

	TableResource t;
	
	public MyThread2(TableResource t){
		this.t = t;
	}
	
	@Override
	public void run(){
		t.printTable(100);
	}
}
