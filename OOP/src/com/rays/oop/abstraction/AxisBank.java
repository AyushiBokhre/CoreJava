package com.rays.oop.abstraction;

public class AxisBank extends Bank {
	@Override
	public void getBankName() {
		System.out.println("Axis Bank");
	}

	@Override
	public void interestRate() {
		System.out.println("Interest Rate of Axis Bank : 20.12");
	}

}
