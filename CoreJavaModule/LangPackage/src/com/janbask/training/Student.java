package com.janbask.training;

public class Student implements Cloneable{
	
	private long rollNo;
	
	private String name;
	
	public Student(int r, String s){
		this.rollNo = r;
		this.name = s;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
