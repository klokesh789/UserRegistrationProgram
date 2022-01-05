package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		UserRegistration registration=new UserRegistration();
		System.out.println("Enter First Name: ");
		String firstname =scanner.next();
		registration.validateFirstName(firstname);
		System.out.println("Enter Last Name: ");
		String lastname =scanner.next();
		registration.validateLastName(lastname);
		System.out.println("Enter EmailID: ");
		String email =scanner.next();
		registration.validateEmail(email);
		System.out.println("Enter PhoneNumber: ");
		String phonenumber =scanner.next();
		registration.validatePhoneNumber(phonenumber);
		System.out.println("Enter Password: ");
		String password =scanner.next();
		registration.validatePassword(password);
		registration.register();
	}
}
