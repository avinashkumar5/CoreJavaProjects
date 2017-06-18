package com.janbask.training;

import java.io.IOException;

public class Parent {
	
	protected Number print() throws IOException{
		System.out.println("Am in Parent");
		return 4;
	}

}
