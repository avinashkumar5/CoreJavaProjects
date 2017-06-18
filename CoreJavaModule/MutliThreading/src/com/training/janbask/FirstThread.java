package com.training.janbask;

public class FirstThread extends Thread{

	@Override
	public void run(){
	   System.out.println("Thread name :: " + Thread.currentThread().getName());
	   System.out.println("Thread priority :: " + Thread.currentThread().getPriority());
       System.out.println("Thread in running state");
	}
}
