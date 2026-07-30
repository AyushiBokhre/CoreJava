package com.rays.oop.constructor;

public class TestAccount {
	public static void main(String[] args) {
		Account ac=new Account("123123","Saving",200.00);
		System.out.println("Account Number : "+ac.getAccNo());
		System.out.println("Account Type : "+ac.getAccType());
		System.out.println("Balance : "+ac.getBalance());
	}

}
