package com.lab03;

import java.util.List;

public class Lab03Main {

	public static void main(String[] args) {
		Library library = new Library();
		
//		List<Integer> evenNumbers = library.find(e -> e % 2 == 0);
//		List<Integer> oddNumbers = library.find(e -> e % 2 != 0);
//		
//		List<Integer> squares = library.compute(e -> e * e);
//		List<Integer> cubes = library.compute(e -> e * e * e);
		
		
		List<Integer> evenNumbers = library.find(e -> e % 2 == 0, e -> e);
		List<Integer> oddNumbers = library.find(e -> e % 2 != 0, e -> e);
		
		List<Integer> squares = library.find(e -> true, e -> e * e);
		List<Integer> cubes = library.find(e -> true, e -> e * e * e);
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(squares);
		System.out.println(cubes);
	}

}
