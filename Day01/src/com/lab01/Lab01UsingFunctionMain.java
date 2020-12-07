package com.lab01;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lab01UsingFunctionMain {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> add = adder;
		BiFunction<Integer, Integer, Integer> subtractor = (a, b) -> a - b;
		operate(add);
		operate(adder);
		operate(subtractor);
		operate((a, b) -> a * b);
		operate((a, b) -> a / b);
		operate((a, b) -> a*a + b*b + 2*a*b);
		operate((a, b) -> a*a - b*b);
	}

	private static void operate(BiFunction<Integer, Integer, Integer> calc) {
		int num1 = 10;
		int num2 = 5;
		System.out.println(calc.apply(num1, num2));
	}
	
	
	
}


