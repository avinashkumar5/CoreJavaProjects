package com.janbask.training;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer s = new StringBuffer("Hello");
		s.append("User");
		
		System.out.println("Append :: " + s.toString());
		
		s.insert(5, " Java ");
		System.out.println("Insert :: " + s.toString());
		
		System.out.println("Reverse :: " + s.reverse());
		
		System.out.println("Capacity ::" + s.capacity());
		s.ensureCapacity(10);
		
		
	}

}
