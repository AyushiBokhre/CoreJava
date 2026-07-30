package com.rays.customexception;

public class LoginException extends Exception {
	public LoginException() {
		super("Invaild Credentials.");
	}

}
