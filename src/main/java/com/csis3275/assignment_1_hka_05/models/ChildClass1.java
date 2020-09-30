package com.csis3275.assignment_1_hka_05.models;

public class ChildClass1 extends BaseModel {
	
	private String property1; 
	private String property2;
	
	public String getProperty1() {
		return property1;
	}
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	public String getProperty2() {
		return property2;
	}
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	
	/*
	 * Trivial Method 1
	 */
	public ChildClass2 getChildClass2() {
		ChildClass2 temp = new ChildClass2();
		temp.setX(Integer.parseInt(property1.trim()));
		temp.setY(Integer.parseInt(property2.trim()));
		temp.setFirstName(firstName);
		temp.setLastName(lastName);
		temp.setAge(age);
		temp.setErrorMessage("No Error");
		return temp;
	}
	
	/*
	 * Trivial Method 1
	 */
	public ChildClass2 updateChildClass2(ChildClass2 temp, Integer x, Integer y) {	
		temp.setX(x);
		temp.setY(y);
		return temp;
	}


	

}
