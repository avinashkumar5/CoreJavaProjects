package com.training.janbask;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Bean {
	
	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	private String property1;
	
	private String property2;

	/**
	 * @return the property1
	 */
	public String getProperty1() {
		return property1;
	}

	/**
	 * @param property1 the property1 to set
	 */
	public void setProperty1(String property1) {
		pcs.firePropertyChange(property1, this.property1, property1);
		this.property1 = property1;
	}

	/**
	 * @return the property2
	 */
	public String getProperty2() {
		return property2;
	}

	/**
	 * @param property2 the property2 to set
	 */
	public void setProperty2(String property2) {
		pcs.firePropertyChange(property2, this.property2, property2);
		this.property2 = property2;
	}
	
    public void addPropertyChangeListner(PropertyChangeListener listener){
    	pcs.addPropertyChangeListener(listener);
    }
}
