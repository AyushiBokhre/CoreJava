package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private String address;
	private Date dob;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public int getAge(Date dob) {

		Date now = new Date();

		int age = now.getYear() - dob.getYear();

		return age;
	}

}
