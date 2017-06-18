package com.janbask.traininigtest;

import com.janbask.training.Parent;

/**
 * Class to demonstrate the access of public & protected 
 * in subclass outside the different package
 * 
 * @author PINTU
 *
 */
public class ChildTest extends Parent{

	public static void main(String[] args) {

		Parent p = new Parent();
		p.getM(); //public method of Parent class
		
		ChildTest childTest = new ChildTest(); // this will call constructor
		childTest.getZ(); // calling the protected method from Parent class inside subclass outside package
	}
}
