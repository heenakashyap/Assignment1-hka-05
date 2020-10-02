package com.csis3275.assignment_1_hka_05.models;

/**
 * 
 * @author Heena
 * Base model class as this will be containing Fields common to child class
 */
public class BaseModel_hka_05 {
	
	protected String firstName;
	protected String lastName;
	protected String age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	

}
