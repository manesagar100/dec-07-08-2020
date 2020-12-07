package com.lab01;

public class Lab01Main {

	public static void main(String[] args) {
		
		Calc adder = (a, b) -> a + b;
		Calc add = adder;
		Calc subtractor = (a, b) -> a - b;
		operate(add);
		operate(adder);
		operate(subtractor);
		operate((a, b) -> a * b);
		operate((a, b) -> a / b);
		operate((a, b) -> a*a + b*b + 2*a*b);
		operate((a, b) -> a*a - b*b);
	}

	private static void operate(Calc calc) {
		int num1 = 10;
		int num2 = 5;
		System.out.println(calc.calculate(num1, num2));
	}
	
	private static void traditionalStyle() {
		int num1 = 10;
		int num2 = 5;
		Calculator calc = new Calculator();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.multiply(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}
	
	
}

@FunctionalInterface
interface Calc {
	int calculate(int num1, int num2);
}


class Calculator {
	public int aPlusBWholeSquare(int num1, int num2) {
		return -1;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}

