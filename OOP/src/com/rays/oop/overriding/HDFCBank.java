package com.rays.oop.overriding;

public class HDFCBank extends RbiBank{
	@Override
	public void interestRate() {
		System.out.println("Interest rate of HDFC Bank : "+interestRate);
	}

}
