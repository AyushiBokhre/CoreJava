package com.rays.oop.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobiles a1 =new Automobiles();
		a1.setColor("Black");
		a1.setSpeed(180);
		//a1.setMake(null);
		a1.setCompany("BMW");
		
		System.out.println("Color : "+a1.getColor());
		System.out.println("Speed : "+a1.getSpeed());
		//System.out.println("Make : "+a1.getMake());
		System.out.println("Company : "+a1.getCompany());;
		
	}

}
