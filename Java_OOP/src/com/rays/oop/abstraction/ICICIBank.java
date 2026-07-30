package com.rays.oop.abstraction;

public class ICICIBank extends Bank{

	@Override
	public void getBankName() {
		System.out.println("ICICI Bank ");
	}

	@Override
	public void interestRate() {
		System.out.println("Interest Rate of ICICI Bank 12.12");
		
	}
}
