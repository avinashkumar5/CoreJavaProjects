package com.training.janbask;

import java.util.Scanner;

public class CustomExceptionTest {

	public static void validate(int age) throws InvalidAgeException, Exception{
		if(age > 18){
			System.out.println("Valid user");
		}else{
			throw new InvalidAgeException("Age is less than 18");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age :: ");
		int a = sc.nextInt();
		try {
			validate(a);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		} catch(Exception e){
			
		}
	}

}
