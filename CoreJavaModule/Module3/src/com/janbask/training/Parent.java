package com.janbask.training;

public class Parent {

	private int x = 5;
	private void getX(){
		System.out.println("value of private x :: " + x);
	}

	int y = 7;
	void getY(){
		System.out.println("value of default y :: " + y);
	}
	
	protected int z = 19;
	protected void getZ(){
		System.out.println("value of protected z :: " + z);
	}
	
	public int m = 12;
	public void getM(){
		System.out.println("value of public m :: " + m);	
	}

	public static void main(String args[]){
		
		Parent p = new Parent();
		p.getX();
		p.getY();
		p.getZ();
		p.getM();

	}
}
