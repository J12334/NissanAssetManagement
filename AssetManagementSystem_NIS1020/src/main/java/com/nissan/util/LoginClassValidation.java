package com.nissan.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.nissan.entity.Login;
import com.nissan.exception.LoginClassCustomeException;

public class LoginClassValidation {

	public static void validateLoginDetails(Login login) throws LoginClassCustomeException {
		validateUsername(login.getUsername());
		validatePassword(login.getPassword());
	}
	
	// method to validate email ID
	private static void validateUsername(String username) throws LoginClassCustomeException {
		Pattern pattern = Pattern.compile("[A-Za-z]" + "@gmail.com");
		Matcher matcher = pattern.matcher(username);
		boolean matchFound = matcher.find();
		
		if(!matchFound) {
			throw new LoginClassCustomeException("Username must contain @gmail.com!!!");
		}	
	}
	
	// method to validate password
	private static void validatePassword(String password) throws LoginClassCustomeException {
		Pattern pattern = Pattern.compile("[A-Za-z]" + "[@#$]" + "[0-9]");
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		
		if(!matchFound) {
			throw new LoginClassCustomeException("Password must contain alphabetts, special characters(@, #, $) and numbers!!!");
		}
	}
	
}
