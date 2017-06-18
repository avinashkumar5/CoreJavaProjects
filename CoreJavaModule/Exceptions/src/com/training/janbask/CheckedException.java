package com.training.janbask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number ::: ");
		try {
			String s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
