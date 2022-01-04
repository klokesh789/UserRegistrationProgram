package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRSTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String LASTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String EMAIL_REGEX= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
	private static final String PHONENUMBER_REGEX = "^[0-9]{2}[\\s][0-9]{10}$";

	public void register(UserDetails userDetails) {
		boolean isFirstNameValid=validateUserDetails(FIRSTNAME_REGEX,userDetails.getFirstname());
		boolean isSecondNameValid=validateUserDetails(LASTNAME_REGEX,userDetails.getLastname());
		boolean isEmailValid=validateUserDetails(EMAIL_REGEX,userDetails.getEmail());
		boolean isNumberValid=validateUserDetails(PHONENUMBER_REGEX,userDetails.getPhonenumber());
		
		if(isFirstNameValid && isSecondNameValid&&isEmailValid&&isNumberValid) {
			System.out.println(userDetails.getFirstname());
			System.out.println(userDetails.getLastname());
			System.out.println(userDetails.getEmail());
			System.out.println(userDetails.getPhonenumber());
			
		}
		else {
			System.out.println("Invalid details");
		}
	}

	private boolean validateUserDetails(String regex, String dataToBeValidated) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(dataToBeValidated);
		return matcher.matches();
		
	}

}
