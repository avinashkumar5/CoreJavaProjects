package com.janbask.training;

public class Fruits implements Comparable<Fruits>{

	private String fruitName;
	private int fruitCost;
	private int fruitQuanlity;
	
	public Fruits(String name, int c, int quantity){
		this.fruitName = name;
		this.fruitCost = c;
		this.fruitQuanlity = quantity;
	}
	
	/**
	 * @return the fruitName
	 */
	public String getFruitName() {
		return fruitName;
	}
	/**
	 * @param fruitName the fruitName to set
	 */
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	/**
	 * @return the fruitCost
	 */
	public int getFruitCost() {
		return fruitCost;
	}
	/**
	 * @param fruitCost the fruitCost to set
	 */
	public void setFruitCost(int fruitCost) {
		this.fruitCost = fruitCost;
	}
	/**
	 * @return the fruitQuanlity
	 */
	public int getFruitQuanlity() {
		return fruitQuanlity;
	}
	/**
	 * @param fruitQuanlity the fruitQuanlity to set
	 */
	public void setFruitQuanlity(int fruitQuanlity) {
		this.fruitQuanlity = fruitQuanlity;
	}

	@Override
	public int compareTo(Fruits object) {
		if(this.fruitQuanlity > object.fruitQuanlity){
			return 1;
		}else if(this.fruitQuanlity < object.fruitQuanlity){
			return -1;
		}else{
			return 0;
		}
		//return object.fruitQuanlity - this.fruitQuanlity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitCost=" + fruitCost + ", fruitQuanlity=" + fruitQuanlity + "]";
	}
	
	
}
