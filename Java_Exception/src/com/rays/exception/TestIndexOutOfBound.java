package com.rays.exception;

public class TestIndexOutOfBound {
	public static void main(String[] args) {
		String name="Ayushi";
		try {
			System.out.println(name.charAt(7));
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

					}
	}

}
