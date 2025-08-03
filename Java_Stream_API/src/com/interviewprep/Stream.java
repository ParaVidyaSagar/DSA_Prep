package com.interviewprep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		String input = "sagar";
		Map<String, Long> map = Arrays.stream(input.split(""))
				                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println(map);   
         
         
         
         //Remove duplicates from Array
         List<Integer> arr = Arrays.asList(1,2,1,2,3,5,5);
         List<Integer> uniques = arr.stream().distinct().collect(Collectors.toList());
         System.out.println(uniques);
         
         //First Non Repeating character
         String str = "sagar";
         Character nonRepeat = str.chars()
        		            .mapToObj(c -> (char) c)
        		            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
        		            .entrySet().stream()
        		            .filter(e -> e.getValue() == 1)
        		            .map(Map.Entry::getKey)
        		            .findFirst().orElse(null);
        System.out.println(nonRepeat);		
        
        //Second Non- Repeating character
        String str1 = "sagar";
        Character nonRepeat1 = str1.chars()
       		            .mapToObj(c -> (char) c)
       		            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
       		            .entrySet().stream()
       		            .skip(1)
       		            .filter(e -> e.getValue() == 1)
       		            .map(Map.Entry::getKey)
       		            .findFirst().orElse(null);
       System.out.println(nonRepeat1);	
       
       
       // Find Frequency Of Each Character In a String
       String ip = "banana";
       Map<Character, Long> freqMap = input.chars()
    		        .mapToObj(c -> (char) c)
    		        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(freqMap);
       
       // Find Second Highest Number in a List
       List<Integer> nums = Arrays.asList(10,9,1,3,4,6,2,6);
       int secondHighest = nums.stream()
    		   .distinct()
    		   .sorted(Comparator.reverseOrder())
    		   .skip(1)
    		   .findFirst().orElse(-1);
       
        System.out.println(secondHighest);
        
        //Find All Duplicate Elements in a 
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> duplicates = list.stream()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream()
        		.filter(e -> e.getValue()>1)
        		.map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
        
        //Sort List of Strings by Length
        List<String>names = Arrays.asList("John", "Alexander", "Bob");
        List<String> sorted = names.stream()
        		.sorted(Comparator.comparing(String::length))
        		.collect(Collectors.toList());
        System.out.println(sorted);
        
        //Group Employees by Department
//        Map<String, List<Employee>> grouped = employees.stream()
//        		                              .collect(Collectors.groupingBy(Employee::getDepartment));
        
	}      		

}
