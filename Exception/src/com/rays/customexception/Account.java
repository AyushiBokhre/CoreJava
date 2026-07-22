package com.rays.customexception;

public class Account {
	public double balance;

	public Account() {

	}

	public Account(double balance) {
		this.balance = balance;

	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InsufficientFundException();
		} else {
			balance = balance - amount;
			System.out.println("New Balance : " + balance);
		}
	}
}
