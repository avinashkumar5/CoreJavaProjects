package com.janbask.training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> setOfFruits = new HashSet<>();
		setOfFruits.add("Organe");
		setOfFruits.add("Apple");
		setOfFruits.add("Banana");
		setOfFruits.add("Banana");
		setOfFruits.add("Grapes");
		System.out.println("HASHSET DEMO ::");
		//Iterate the set
		setOfFruits.forEach(f ->{
			System.out.print(f + ",");
		});
		
		System.out.println();
		Set<String> setLinked = new LinkedHashSet<>();
		setLinked.add("Organe");
		setLinked.add("Apple");
		setLinked.add("Banana");
		setLinked.add("Grapes");
		System.out.println("LinkedHASHSET DEMO ::");
		//Iterate the set
		setLinked.forEach(f ->{
			System.out.print(f + ",");
		});
		
		System.out.println();
		Set<String> treeLinked = new TreeSet<>();
		treeLinked.add("Organe");
		treeLinked.add("Apple");
		treeLinked.add("Banana");
		treeLinked.add("Grapes");
		System.out.println("TreeSET DEMO ::");
		//Iterate the set
		treeLinked.forEach(f ->{
			System.out.print(f + ",");
		});
		
	}

}
