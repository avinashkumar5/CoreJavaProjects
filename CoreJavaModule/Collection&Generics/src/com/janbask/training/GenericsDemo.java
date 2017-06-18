package com.janbask.training;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		//before generics
		List listOfFruits = new ArrayList();  //16 dynamic 
		
		listOfFruits.add("Banana");
		listOfFruits.add(45);
		listOfFruits.add(46.78);
		
		//After generics
		
		List<String> listOfCars = new ArrayList();
		listOfCars.add("Toyota");
		//listOfCars.add(6);
		
	}

}
