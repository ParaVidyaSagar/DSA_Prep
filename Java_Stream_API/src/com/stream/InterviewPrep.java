package com.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewPrep {
	public static void main(String[] args) {
		//irst non-repeated character in a String using Streams
		String input = "javastream";
		Character result = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap :: new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		System.out.println(result);
		
		//frequency of each character in a String
		String str = "banana";
	}

}
