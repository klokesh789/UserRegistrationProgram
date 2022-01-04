package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstname =scanner.next();
		System.out.println("Enter Last Name: ");
		String lastname =scanner.next();
		UserDetails userDetails=new UserDetails();
		userDetails.setFirstname(firstname);
		userDetails.setLastname(lastname);
		UserRegistration registration=new UserRegistration();
		registration.register(userDetails);
	}
}
