package com.janbask.training;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionLogger {

	public void checkAge(int age) throws AgeException{
		if(age < 18){
			throw new AgeException("Age cannot be less than 18");
		}
	}
	
	public static void main(String[] args) {
		
        FileWriter fileWriter = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age :: ");
		int age = sc.nextInt();
		ExceptionLogger el = new ExceptionLogger();
	    try {
	    	
	    	fileWriter = new FileWriter("C://Users//PINTU//Desktop//Training//Module//FileSystem//input.txt");
			el.checkAge(age);
			
		} catch (AgeException e) {
			try {
				fileWriter.write(e.getMessage());
				fileWriter.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
