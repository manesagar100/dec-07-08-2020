package com.lab02;
import static com.lab02.ValidationConstants.*;

public class Lab02Main {

	public static void main(String[] args) {
		String userName = "samy123";
		final boolean userNameValid = isNotNull
			.and(isNotBlank.and(isUsernameLengthBw5And10))
			.test(userName);
		System.out.println(userNameValid);
		
		String password = "23o8476";
		final boolean passwordValid = isNotNull
			.and(isNotBlank.and(isPasswordLengthBw3And8))
			.test(password);
		System.out.println(passwordValid);
		
	}

}
