package com.microsoft.personal;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int i = scan.nextInt();
		System.out.println("Scanner :: " + i);
		
		System.out.println("Enter number ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ia = Integer.parseInt(br.readLine());
		
		System.out.println("Reader :: " + ia);
		System.out.println("Enter number ");
		DataInputStream dis = new DataInputStream(System.in);
		int id = dis.readInt();
		
		System.out.println("DA :: " + id);
		
	}

}
