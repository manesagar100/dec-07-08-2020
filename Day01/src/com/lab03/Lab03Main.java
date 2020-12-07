package com.lab03;

import java.util.function.Function;

public class Lab03Main {

	public static void main(String[] args) {
		
		Function<Data, Data> aSquare = input -> new Data(input.a, input.b, input.result + (input.a * input.a));
		Function<Data, Data> bSquare = input -> new Data(input.a, input.b, input.result + (input.b * input.b));
		Function<Data, Data> twoAB = input -> new Data(input.a, input.b, input.result + (2 * input.a * input.b));
		
		var result = aSquare
				.andThen(bSquare)
				.andThen(twoAB)
				.apply(new Data(10, 12, 0))
				.result;
		System.out.println(result);
	}

}

class Data {
	public final int a, b, result;
	public Data(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
}
