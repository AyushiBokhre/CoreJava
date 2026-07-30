package com.rays.exception;

public class TestMultipleCatchBlock {
	public static void main(String[] args) {
		String name = "Ayushi";
//		String name="";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}
	}

}
