package com.janbask.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWithArrayList {

	public static void main(String[] args) {

		List<String> listOfFruits = new ArrayList<>();
		listOfFruits.add("Banana");
		listOfFruits.add("Orange");
		listOfFruits.add("Papaya");
		listOfFruits.add("Grapes");
		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		
		System.out.println("SIZE :: " + listOfFruits.size());
		
		//First way
		System.out.println("Simple For Loop");
		for(int i =0 ; i < listOfFruits.size() ; i++){
			System.out.print(listOfFruits.get(i) + ",");
		}
		System.out.println();
		//Advanced For loop
		System.out.println("Advanced For Loop");
		for(String fruits : listOfFruits){
			System.out.print(fruits + ",");
		}
		
		//While loop
		System.out.println();
		System.out.println("While Loop ");
		
		int j = 0;
		while(j < listOfFruits.size()){
			System.out.print(listOfFruits.get(j) + ",");
			j++;
		}
		
		//Iteration
		System.out.println();
		System.out.println("Iterator Loop ");
		Iterator<String> it = listOfFruits.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + ",");
		}
		
		//Java 8 Stream API
		System.out.println();
		System.out.println("Java 8 Stream API ");
		listOfFruits.stream().forEach(fruits -> { 
			System.out.print(fruits + ",");
		});
	}

}
