package com.janbask.training;

import java.lang.reflect.Field;


public class AccessPrivateDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, 
										SecurityException, IllegalArgumentException, IllegalAccessException{

		Class c = Class.forName("com.janbask.training.Rate");
		Rate rate = new Rate();

		Field field = c.getDeclaredField("roi");

		field.setAccessible(true);

		long value = (long) field.get(rate);

		System.out.println("Value of ROI :: " + value);
	}	
}
