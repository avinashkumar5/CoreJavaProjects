package com.janbask.training;

import java.lang.reflect.Constructor;

public class ReflectionConstrutorDemo {

	public static void main(String[] args) {

		Student s = new Student();
		
		Class c = s.getClass();
		
		Constructor [] constructors = c.getDeclaredConstructors();
		
		for(Constructor co : constructors){
			System.out.println(co);
		}
	}

}
