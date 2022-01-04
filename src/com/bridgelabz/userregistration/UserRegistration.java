package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRSTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String LASTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";

	public void register(UserDetails userDetails) {
		boolean isFirstNameValid=validateUserDetails(FIRSTNAME_REGEX,userDetails.getFirstname());
		boolean isSecondNameValid=validateUserDetails(LASTNAME_REGEX,userDetails.getLastname());
		
		if(isFirstNameValid && isSecondNameValid) {
			System.out.println(userDetails.getFirstname());
			System.out.println(userDetails.getLastname());
		}
		else {
			System.out.println("InvalidName");
		}
	}

	private boolean validateUserDetails(String regex, String dataToBeValidated) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(dataToBeValidated);
		return matcher.matches();
		
	}

}
