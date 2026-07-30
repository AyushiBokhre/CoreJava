package com.rays.exception;

public class TestParentCatchBlock {
	public static void main(String[] args) {
		//String name = "Ayushi";
		 String name=null;
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} 
	}

}
