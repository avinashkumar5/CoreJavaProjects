package com.janbask.training;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> mapOfData = new HashMap<>();
		mapOfData.put("John Smith", 123523);
		mapOfData.put("John Smith2", 123544);
		mapOfData.put("John Smith1", 123242);
		
		System.out.println(mapOfData.size() + " Value ::" + mapOfData.get("John Smith"));
		
		boolean isPresent = mapOfData.containsKey("John Smith");
		System.out.println(isPresent);
		mapOfData.remove("John Smith");
		//Iteration 
		System.out.println("Advanced For Loop ");
		for(Map.Entry<String, Integer> m : mapOfData.entrySet()){
			System.out.println("Key ::" + m.getKey() + ", Value ::" + m.getValue());
		}
		//Java 8
		
		System.out.println();
		System.out.println("JAVA 8 Map interation");
		
		mapOfData.forEach((k,v) -> {
			System.out.println("Key ::" + k + ", Value ::" + v);
		});
	}

}
