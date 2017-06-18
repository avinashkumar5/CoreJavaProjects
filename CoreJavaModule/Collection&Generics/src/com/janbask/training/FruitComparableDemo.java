package com.janbask.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitComparableDemo {

	public static void main(String[] args) {

		List<Fruits> fruitsList = new ArrayList<>();
		fruitsList.add(new Fruits("Banana", 45, 6));
		fruitsList.add(new Fruits("Apple", 65, 12));
		fruitsList.add(new Fruits("Grapes", 85, 7));
		fruitsList.add(new Fruits("Orange", 100, 4));
		
		System.out.println("Unstorted Fruits");
		fruitsList.forEach(f -> {
			System.out.println(f);
		});
		
		Collections.sort(fruitsList);
		System.out.println();
		
		System.out.println("Storted Fruits");
		fruitsList.forEach(f -> {
			System.out.println(f);
		});	

	}

}
