package com.rays.oop.constructor;


public class Person {
	private String name;
	private String address;
	private String dob;
	
	//parameterized Constructor is used when we want to assign memory or 
	//values  to the class attribute at the time of object creation
	public Person(String name,String address,String dob ) {
		this.name=name;
		this.address=address;
		this.dob=(dob);
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

	
	
}
