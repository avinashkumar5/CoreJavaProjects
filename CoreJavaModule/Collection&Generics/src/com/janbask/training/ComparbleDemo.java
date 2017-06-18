package com.janbask.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparbleDemo {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		
		System.out.println("Unstored List");
		fruits.forEach(f ->{
			System.out.print(f + ",");
		});
		
		Collections.sort(fruits); // sort the fruits in natural order
		
		System.out.println();
		System.out.println("Stored List");
		fruits.forEach(f ->{
			System.out.print(f + ",");
		});
	}

}
