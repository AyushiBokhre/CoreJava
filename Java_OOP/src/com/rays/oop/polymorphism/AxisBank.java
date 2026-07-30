package com.rays.oop.polymorphism;

public class AxisBank extends Bank {
	@Override
	public double interestRate() {
		return 11.2;
	}
	
	@Override
	public String getName() {
		return "Axis Bank";
	}

}
