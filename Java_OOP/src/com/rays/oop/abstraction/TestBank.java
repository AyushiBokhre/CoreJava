package com.rays.oop.abstraction;

public class TestBank {
	public static void main(String[] args) {
		Bank b =new AxisBank();
		AxisBank ab=(AxisBank)b;
		ab.getBankName();
		b.interestRate();
		System.out.println("--------------------------");
		Bank b1=new HdfcBank();
		b1.getBankName();
		b1.interestRate();
		System.out.println("--------------------------");
		Bank b2=new ICICIBank();
		b2.getBankName();
		b2.interestRate();
		
	}
	
}
