package com.janbask.training;

import java.lang.reflect.Field;

public class ReflectionFieldDemo {

	public static void main(String[] args) {

	/*	int a[] = {4,5,6};
		
		for(int p : a){
			System.out.print(p + ",");
		}*/
		
		Class z = Student.class;
		
		Field []allField = z.getDeclaredFields();
		Field [] publicField = z.getFields();
		
		try {
			Field roll = z.getField("roll");
			System.out.println("Roll " + roll );
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*for(int i =0 ; i < field.length ; i++){
			Field f = field[i];
			System.out.println(f);
		}*/
		
		//Advance for loop
		for(Field f : allField){
            System.out.println(f);
		}
		
		//Advance for loop
		for(Field f : publicField){
            System.out.println(f);
		}
	}

}
