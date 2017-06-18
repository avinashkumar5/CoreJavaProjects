package com.janbask.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //For Accepting
		
		//Accepting number
		System.out.println("Enter the number :: ");
		
		int n = Integer.parseInt(br.readLine());
		//Accepting String
		System.out.println("Enter the string ::");
		String s = br.readLine();
		
		
		System.out.println("NUmber entered was :: " + n);
		System.out.println("String accepted was :: " + s);
		
		System.out.println("Enter the floating point number :: ");
		
		float f = Float.parseFloat(br.readLine());
		System.out.println("Floating number accepted was :: " + f);
		
		System.out.println("Enter the double number :: ");
		double d = Double.parseDouble(br.readLine());
		
		System.out.println("Double number accepted was :: " + d);
		
		System.out.println("Enter the character ::");
		
		char c = (char) br.read();
		
		System.out.println("Character accepted was :: " + c);
		
		char p = 'P';
		int ascii = (int) p;
		System.out.println("Ascii code of P :: " + ascii);
	}

}
