package com.rays.oop.overriding;

public class TestRbiBank {
	public static void main(String[] args) {
		RbiBank r = new RbiBank();
		r.setBankName("RBI Bank");
		r.setInterestRate(10.1);
		
		System.out.println(r.getBankName());
		r.interestRate();
		System.out.println("-------------");

		AxisBank a = new AxisBank();
		a.setBankName("Axis Bank");
		a.setInterestRate(11.1);
		System.out.println("Bank Name :" + a.getBankName());
		a.interestRate();

		System.out.println("---------------");

		HDFCBank h = new HDFCBank();
		h.setBankName("HDFC Bank");
		h.setInterestRate(9.8);

		System.out.println("Bank Name :" + h.getBankName());
		h.interestRate();

		System.out.println("-----------------");

		SBIBank s = new SBIBank();
		s.setBankName("SBI Bank");
		
		System.out.println("Bank Name :" + s.getBankName());
		s.interestRate();

	}

}
