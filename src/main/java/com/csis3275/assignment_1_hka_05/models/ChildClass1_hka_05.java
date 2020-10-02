package com.csis3275.assignment_1_hka_05.models;

/**
 * 
 * @author Heena
 * Received as a model in the controller 
 */
public class ChildClass1_hka_05 extends BaseModel_hka_05 implements BaseInterface_hka_05 {
	
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
	public ChildClass2_hka_05 getChildClass2() {
		ChildClass2_hka_05 temp = new ChildClass2_hka_05();
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
	public ChildClass2_hka_05 updateChildClass2(ChildClass2_hka_05 temp, Integer x, Integer y) {	
		temp.setX(x);
		temp.setY(y);
		return temp;
	}
	@Override
	public String method1() {
		return "This is child class 1 and method 1";

	}
	@Override
	public String method2() {
		return "This is child class 1 and method 2";
	}


	

}
