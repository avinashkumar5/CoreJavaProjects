package com.janbask.training;

import java.util.Scanner;

public class LoopingAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = null;
		String ans;
		do{
			System.out.println("Please enter the name ");
			name = sc.next();
			if(name.equalsIgnoreCase("Zaheer")){
				System.out.println("Welcome " + name);
				break;
			}else{
				System.out.println("Entered name is not Zaheer");
				System.out.println("Do you want to continue(Y/N) ?");
				ans = sc.next();
			}
		}while(ans.equalsIgnoreCase("Y"));
	}

}
