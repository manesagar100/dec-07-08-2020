package com.lab02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab02Main {

	public static void main(String[] args) throws IOException {
		// Starting point
		List<String> lines = Files.readAllLines(Paths.get("./places.txt"));
		
		
		// Extract and store all the city names alone in a separate file called **cities.txt**
		
		final List<String> cities = lines
			.stream()
			.skip(1)
			.map(line -> line.split(",")[0])
			
			.collect(Collectors.toList());
		Files.write(Paths.get("./cities.txt"), cities);
		
		// Extract and store all the state names alone in a separate file called **states.txt**
		
		final List<String> states = lines
				.stream()
				.skip(1)
				.map(line -> line.split(",")[1])
				.distinct()
				.collect(Collectors.toList());
			Files.write(Paths.get("./states.txt"), states);
		
			
		// Print the count of all cities grouped by state.
			
			Map<String, List<String>> groupedStates = lines
				.stream()
				.skip(1)
				.map(line -> line)
				.collect(Collectors.groupingBy(line -> line.split(",")[1]));
				
			groupedStates.forEach((key, value) -> System.out.println(key + ": , cities: " + value.size()));
			
			
			// Generate **places.json** file with all the contents in JSON format
			
			final String json = lines
				.stream()
				.skip(1)
				.map(Place::new)
				.map(Place::toJson)
				.collect(Collectors.joining(",\n", "[\n", "\n]\n"));
				
			Files.write(Paths.get("./places.json"), json.getBytes());
			
			
		System.out.println("Done");
	}

}

class Place {
	private String city;
	private String state;
	private long geonameId;
	
	public Place(String feed) {
		String[] arr = feed.split(",");
		this.city = arr[0];
		this.state = arr[1];
		this.geonameId = Long.parseLong(arr[2]);
	}
	// NOT RECOMMENDED; Use libraries instead
	// Use StringBuilder instead
	public String toJson() {
		String json = "{";
		json += "\"city\": \"" + city + "\", ";
		json += "\"state\": \"" + state + "\", ";
		json += "\"geonameid\": " + geonameId;
		json += "}";
		return json;
	}
}






