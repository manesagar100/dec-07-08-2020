package com.lab05;

import java.util.Arrays;
import java.util.List;

public class Lab05Main {

	public static void main(String[] args) {
		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		// Find the double of the first even number greater than 3 or else return -1.
		
		final int result = numbers
			.stream()
			.filter(it -> it % 2 == 0)
			.filter(it -> {
				return it > 3;
			})
			.peek(it -> System.out.println("*** " + it)) // just to peek and check what's going on
			.map(it -> it * 2)
			//.skip(2)
			.findFirst()
			.orElse(-1);
		System.out.println(result);
		
		
		// Find the sum of the squares of all numbers 
		
		final int sumOfSquares = numbers
				.stream()
				.map(it -> it * it)
				.reduce((curValue, nextValue) -> curValue + nextValue)
				.get();
		System.out.println(sumOfSquares);
		
		
		final int sumOfSquares2 = numbers
				.stream()
				.mapToInt(it -> it * it)
				.sum();
		System.out.println(sumOfSquares2);
		
		
		// Largest Odd number
		
		final int largestOdd = numbers
				.stream()
				.mapToInt(it -> it)
				.filter(it -> it % 2 != 0)
				.max()		
				.getAsInt();
			
			System.out.println(largestOdd);
		
		
		// Largest number with and without using max() function
		
		final int max = numbers
			.stream()
			.mapToInt(it -> it)
			.max()		//min()
			.getAsInt();
		
		System.out.println(max);
		
		final int maxWithoutUsingMaxFunction 
			= numbers
				.stream()
				.reduce((curValue, nextValue) -> curValue > nextValue ? curValue : nextValue)
				.get();
		System.out.println(maxWithoutUsingMaxFunction);
		
	}

}
