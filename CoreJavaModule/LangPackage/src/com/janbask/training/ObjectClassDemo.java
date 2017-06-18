package com.janbask.training;

public class ObjectClassDemo {

	private String className;
	
	private String objectName;
	
	public ObjectClassDemo(String className, String objName){
		this.className = className;
		this.objectName = objName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjectClassDemo [className=" + className + ", objectName=" + objectName + "]";
	}

	public static void main(String[] args) {

		ObjectClassDemo object = new ObjectClassDemo("ObjectDemo", "Object");
		System.out.println("Object Class toString Method :: " + object.toString());

		System.out.println("Object Class hashCode Method :: " + object.hashCode());
	}

}
