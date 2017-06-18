package com.janbask.training;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivateMethodDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
		Class c = Rate.class;
		
		Rate rate = new Rate();
		
		Method method = c.getDeclaredMethod("rateOfInterest");
		
		method.setAccessible(true);
		
		method.invoke(rate);
	}

}
