package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRSTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String LASTNAME_REGEX = "^[A-Z][a-z A-z]{2,}";
	private static final String EMAIL_REGEX= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[0-9]{10}";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid;

	public boolean validateFirstName(String firstName) {
		isFirstNameValid= Pattern.matches(FIRSTNAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
			System.exit(0);
		}
		return Pattern.matches(FIRSTNAME_REGEX,firstName);
	}
	public boolean validateLastName(String lastName) {
		isLastNameValid= Pattern.matches(LASTNAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
			System.exit(0);
		}
		return Pattern.matches(LASTNAME_REGEX, lastName);
	}
	public boolean validateEmail(String mail) {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
			System.exit(0);
		}
		return Pattern.matches(EMAIL_REGEX, mail);
	}
	public boolean validatePhoneNumber(String phoneNumber) {
		isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
		if(!isNumberValid) {
			System.out.println("Phone Number is invalid...Please enter proper phone-number");
			System.exit(0);
		}
		return Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
	}
	public boolean validatePassword(String password) {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
			System.exit(0);
		}
		return Pattern.matches(PASSWORD_REGEX, password);
	}
		
	public void register() {
		if(isFirstNameValid && isLastNameValid && isMailValid && isNumberValid & isPasswordValid) {
			System.out.println("You are registered!!!");
			System.out.println("Welcome");
		}
	}
}
