package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration<booleon> {
	private static final String FIRSTNAME_REGEX = "^[A-Z][a-z A-z]{3}";

	public void register(UserDetails userDetails) {
		boolean isNameValid=validateUserDetails(userDetails);
		if(isNameValid) {
			System.out.println(userDetails.getFirstname());
		}
		else {
			System.out.println("InvalidName");
		}
	}

	private boolean validateUserDetails(UserDetails userDetails) {
		Pattern pattern=Pattern.compile(FIRSTNAME_REGEX);
		Matcher matcher=pattern.matcher(userDetails.getFirstname());
		return matcher.matches();
		
	}

}
