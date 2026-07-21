package com.rays.exception;

public class TestArithmeticException {
	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		
		try {
			int div = b / a;
			System.out.println(div);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
