package com.rays.oop.overriding;

public class SBIBank extends RbiBank {
	@Override
	public void interestRate() {
		System.out.println("Interest Rate of SBI Bank :"+interestRate);
	}

}
