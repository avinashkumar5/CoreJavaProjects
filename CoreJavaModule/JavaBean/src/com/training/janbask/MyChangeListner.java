package com.training.janbask;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyChangeListner implements PropertyChangeListener{

	@Override
	public void propertyChange(PropertyChangeEvent evt) {

		System.out.println("Bean Property :: " + evt.getPropertyName());
		
		System.out.println("OLD Value :: " + evt.getOldValue());
		
		System.out.println("New Value :: " + evt.getNewValue());
		
		System.out.println("***********************************************");
	}

}
