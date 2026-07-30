package com.rays.oop.constructor;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a =new Automobile("Black","BMW",180);
		System.out.println("Color : "+a.getColor());
		System.out.println("Company : "+a.getMake());
		System.out.println("Speed : "+a.getSpeed());
	}

}
