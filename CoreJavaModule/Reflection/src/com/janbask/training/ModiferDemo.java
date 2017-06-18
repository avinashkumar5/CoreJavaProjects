package com.janbask.training;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModiferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class c = Student.class;
		
		try {
			
			Field f = c.getDeclaredField("age");
			System.out.println(Modifier.isPrivate(f.getModifiers()));
			
			System.out.println(Modifier.isStatic(f.getModifiers()));
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
