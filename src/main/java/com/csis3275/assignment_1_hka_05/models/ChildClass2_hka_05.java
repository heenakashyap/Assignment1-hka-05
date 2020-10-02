package com.csis3275.assignment_1_hka_05.models;

public class ChildClass2_hka_05 extends BaseModel_hka_05 implements BaseInterface_hka_05 {
	
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
	public double salaryChange() 
	{
		return ((y-x)/(double)x)*100;
	}
	
	/*
	 * Trivial Method 3
	 */
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	@Override
	public String method1() {
		return "This is child class 2 and method 1";

	}
	@Override
	public String method2() {
		return "This is child class 2 and method 2";
	}

}
