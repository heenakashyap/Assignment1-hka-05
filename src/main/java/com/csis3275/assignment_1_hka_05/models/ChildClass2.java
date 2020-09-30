package com.csis3275.assignment_1_hka_05.models;

public class ChildClass2 extends BaseModel {
	
	protected Integer x = 0;
	protected Integer y = 0;
	
	protected String errorMessage = "";
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	/*
	 * Trivial Method 1
	 */
	public Integer add() {
		return x+y;
	}
	
	/*
	 * Trivial Method 2
	 */
	public Integer mulitply() {
		return x*y;
	}
	
	/*
	 * Trivial Method 3
	 */
	public String getFullName() {
		return firstName+" "+lastName;
	}

}
