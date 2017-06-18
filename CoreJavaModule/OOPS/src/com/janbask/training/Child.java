package com.janbask.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Child class act as SubClass and Parent class is SuperClass
 * @author PINTU
 * 
 * INTERGER IS CO-VARIENT OF  NUMBER CLASS
 *
 */
public class Child extends Parent{

	 public Integer print() throws IOException{
	   System.out.println("Am in Child");	
	   return 8;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the number");
		
		i = Integer.parseInt(br.readLine());
		
		
		Parent p = new Child();
		//p.print();
		
}

}
