package com.lab02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RefactoredLab02Main {

	static List<String> lines;
	public static void main(String[] args) throws IOException {
		lines = Files.readAllLines(Paths.get("./places.txt"));


		generateTxtFile("./cities.txt", line -> line.split(",")[0]);
		generateTxtFile("./states.txt", line -> line.split(",")[1]);
		
	}
	
	static void generateTxtFile(String fileName, Function<String , String> mapFn) throws IOException {
		List<String> lst = lines
				.stream()
				.skip(1)
				.map(mapFn)
				.distinct()
				.collect(Collectors.toList());
		
		Files.write(Paths.get(fileName), lst);
	}
	
	
	
	
	
	
	
	
	
	

}
