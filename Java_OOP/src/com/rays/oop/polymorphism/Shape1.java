package com.rays.oop.polymorphism;

public class Shape1 {

	public void execute() {
		if (validate()) {
			area();
		} else {
			System.out.println("Invalid Parameters");
		}
	}

	
	public void area() {
		System.out.println("shape area method.");
	}

	
	public boolean validate() {
		return false;
	}

}
