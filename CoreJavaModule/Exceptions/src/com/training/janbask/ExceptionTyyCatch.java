package com.training.janbask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTyyCatch {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the number ");
		
		try {
			
			int s = Integer.parseInt(br.readLine());
			
		} catch (NumberFormatException e) {
			System.out.println("Number format Exception occurs");
			e.printStackTrace();
		} catch (IOException e) {
            System.out.println("IOEXCEPTION OCCURS ");
			e.printStackTrace();
		}
		
		
		try{
			 int a = 5/0;
			 int b[] = new int[3];
			 
			 b[5] = 5;
			 
		}catch(ArithmeticException |  ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occurs");
			e.printStackTrace();
		}
		
		
		System.out.println("Program run successfully");
	}

}
