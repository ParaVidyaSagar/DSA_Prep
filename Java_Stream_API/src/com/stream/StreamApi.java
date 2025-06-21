package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
	
	public static void main(String[] args) {
		
	//1. Convert a list of Strings to upperCase, sort them and print
		List<String> fruits = Arrays.asList("sagar", "thanuja");
		fruits.stream()
		//.map(str -> str.toUpperCase())
		.map(String::toUpperCase)
		.sorted()
		//.forEach(str -> System.out.print(str+" ")); using lambda expressions
		.forEach(System.out::println); // uisng method references
	
	//2. Get the list of Strings where the length of each element is >5 and get the count
		List<String> fruits1 = Arrays.asList("sagar","sagar", "thanuja");
	  /*
	   Predicate<String> pred = str -> {
	   if(str.length()<5) retrun true;
	   else return false;
	   instead of using predicate method filter in java8
	   */
		
		fruits1.stream()
		       .filter(str->str.length()>5)
		       .forEach(System.out::println);
		
		//3. Remove duplicates from a list
		System.out.println("Remove duplicates from a list");
		fruits.stream().distinct().forEach(System.out::println);
		
		//3. filtering a even numbers
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n%2 ==0)
				.collect(Collectors.toList());
		evenNumbers.forEach(System.out::print);
		
		//4. find maximum - finding the maximum value in the list of intrgers
		
		Optional<Integer> max= evenNumbers.stream()
				                          .max(Integer::compare);
		System.out.println(max);
		
	
	}
}
