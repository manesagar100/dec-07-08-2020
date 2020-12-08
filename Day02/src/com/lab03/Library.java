package com.lab03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);

	public List<Integer> find(Predicate<Integer> condition, Function<Integer, Integer> logic) {
		return numbers
					.stream()
					.filter(condition)
					.map(logic)
					.collect(Collectors.toList());
	}
	
	
//	public List<Integer> find(Predicate<Integer> condition) {
//		return numbers
//					.stream()
//					.filter(condition)
//					.collect(Collectors.toList());
//	}
//	
//
//	public List<Integer> compute(Function<Integer, Integer> mapFn) {
//		return numbers
//					.stream()
//					.map(mapFn)
//					.collect(Collectors.toList());
//	}

}
