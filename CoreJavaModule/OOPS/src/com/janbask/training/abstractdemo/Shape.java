package com.janbask.training.abstractdemo;

public abstract class Shape {

	public abstract void draw();  //abstract method
	
	public void info(){   //non-abstract method
		System.out.println("Abstract class information");
	}
	
}
