package com.rays.customexception;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {

//		String login = "admin";
		String login = "admin123";

		if (login.equals("admin")) {
			System.out.println("User Found!");
		}else {
			throw new LoginException();
		}
	}

}
