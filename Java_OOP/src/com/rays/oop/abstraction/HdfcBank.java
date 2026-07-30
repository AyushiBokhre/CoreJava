package com.rays.oop.abstraction;

public class HdfcBank extends Bank{
	@Override
	public void getBankName() {
		System.out.println("HDFC Bank");
	}

	@Override
	public void interestRate() {
		System.out.println("Interst Rate of HDFC Bank : 17.2");
		
	}

}
