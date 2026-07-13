package com.rays.oop.overriding;

public class RbiBank {
	protected String bankName;
	protected double interestRate;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void interestRate() {
		System.out.println("Interest Rate of RBI bank : " +interestRate);
	}

}
