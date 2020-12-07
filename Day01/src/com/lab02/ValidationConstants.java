package com.lab02;

import java.util.function.Predicate;

public interface ValidationConstants {
	Predicate<String> isNotBlank = data -> !data.isBlank();
	Predicate<String> isNotNull = data -> data != null;
	Predicate<String> isUsernameLengthBw5And10 = data -> data.length() >= 5 && data.length() <= 10;
	Predicate<String> isPasswordLengthBw3And8 = data -> data.length() >= 3 && data.length() <= 8;

	Predicate<Integer> isOk = code -> code == 200;
	Predicate<Integer> isNotFound = code -> code == 404;
	
}
