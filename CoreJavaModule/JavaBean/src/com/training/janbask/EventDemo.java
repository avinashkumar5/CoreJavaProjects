package com.training.janbask;

public class EventDemo {

	public static void main(String[] args) {

		
		Bean b1 = new Bean();
		b1.addPropertyChangeListner(new MyChangeListner());
		
		b1.setProperty1("Janbask");
		
		b1.setProperty2("Training");
		
		b1.setProperty1("Janbask1");
		
		b1.setProperty2("Training1");
	}

}
