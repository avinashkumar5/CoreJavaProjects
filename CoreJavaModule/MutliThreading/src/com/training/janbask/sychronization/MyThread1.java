package com.training.janbask.sychronization;

public class MyThread1 extends Thread{

	TableResource t;
	
	public MyThread1(TableResource t){
		this.t = t;
	}
	
	@Override
	public void run(){
		t.printTable(5);
	}
}
