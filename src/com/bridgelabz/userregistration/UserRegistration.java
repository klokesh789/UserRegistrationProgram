package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRSTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String LASTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String EMAIL_REGEX= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
	private static final String PHONENUMBER_REGEX = "^[0-9]{2}[\\s][0-9]{10}$";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";

	public void register(UserDetails userDetails) {
		boolean isFirstNameValid=validateUserDetails(FIRSTNAME_REGEX,userDetails.getFirstname());
		boolean isSecondNameValid=validateUserDetails(LASTNAME_REGEX,userDetails.getLastname());
		boolean isEmailValid=validateUserDetails(EMAIL_REGEX,userDetails.getEmail());
		boolean isNumberValid=validateUserDetails(PHONENUMBER_REGEX,userDetails.getPhonenumber());
		boolean isPasswordValid = validateUserDetails(PASSWORD_REGEX,userDetails.getPassword());
		
		if(isFirstNameValid && isSecondNameValid&&isEmailValid&&isNumberValid&&isPasswordValid) {
			System.out.println("Entered Details Are Valid");
			
			
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
