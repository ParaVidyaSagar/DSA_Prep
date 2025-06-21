package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GenZStreamApiCoding {
	public static void main(String[] args) {
		/*
		 * 1. Filter Even Numbers -- Given a list of integers, return a list containing
		 * only even numbers.
		 */
		List<Integer> numbers = Arrays.asList(1, 40, 50, 89, 79);
		List<Integer> evenNumbers = numbers.stream()
				                     .filter(n -> n % 2 == 0)
				                     .collect(Collectors.toList());
		/*
		 * The filter method is used to apply a condition that keeps only even numbers.
		 * The collect method gathers the results into a new list.
		 */
		evenNumbers.forEach(System.out::println);

		// 2. Find Maximum - Find the maximum value in a list of integers.
		Optional<Integer> max = evenNumbers.stream()
				                .max(Integer::compare);
		System.out.println(max);
		/*
		 * The max method takes a comparator and returns the maximum element wrapped in
		 * an Optional.
		 */

		/*
		 * 3. Sum of Elements Calculate the sum of elements in a list of integers.
		 */
		int sum = numbers.stream()
				         .mapToInt(Integer::intValue)
				         .sum();
		System.out.println(sum);
		/*
		 * mapToInt converts the stream to an IntStream, which provides the sum method
		 * to get the total.
		 */
		/*
		 * 4. List of Names to Uppercase Convert all strings in a list to uppercase.
		 */
		List<String> names = Arrays.asList("sagar", "Ram", "Vinith");
		List<String> upperNames = names.stream()
				                  .map(String::toUpperCase)
				                  .collect(Collectors.toList());
		upperNames.forEach(System.out::println);
		/*
		 * The map function applies String::toUpperCase to each element, transforming
		 * them to uppercase.
		 */
		/* 5. Sort List-Sort a list of integers in ascending order. */
		List<Integer> sortedNumbers = numbers.stream()
				                      .sorted()
				                      .collect(Collectors.toList());
		/*The sorted method sorts the elements of the stream in natural order.*/
		
		//6. Count Elements-Count the number of elements in a list that are greater than 5
		 long count = numbers.stream()
				      .filter(n -> n >5)
				      .count();
		 System.out.println("Count of values greater than 5" + count);
		 /*
		 The filter method removes elements that don't satisfy the condition, 
		 and count returns the number of elements remaining.*/
		 
		 //7. Get Distinct Elements - Get a list of distinct elements from a list of integers.
		 List<Integer> distinctNumbers = numbers.stream()
				                         .distinct()
				                         .collect(Collectors.toList());
		 System.out.println(distinctNumbers);
		 /*The distinct method filters the stream to include only unique elements.*/
		 
		 //8. Reduce to Sum - Reduce a list of integers to their sum.
		 int total = numbers.stream()
				     .reduce(0, Integer::sum);
		 
		 System.out.println(total);
		 /*
		   The reduce method takes an identity (0 in this case) and an accumulator function (Integer::sum) to calculate the total.
		  */
		 
		 //9. Find Any - Return any element from a list of integers.
		 Optional<Integer> anyElement = numbers.stream()
				                               .findAny();
		 System.out.println(anyElement);
		 /*
		  *findAny potentially returns any element from the stream, wrapped in an Optional. 
		  */
		 
		 //10.List First Names- Extract first names from a list of full names.
		 List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
		 List<String> firstNames = fullNames.stream()
				                   .map(name -> name.split(" ")[0])
				                   .collect(Collectors.toList());
		 System.out.println(firstNames);
		 //The map function splits each name string and selects the first part.
		 
		 //11. All Match - Check if all numbers in a list are positive.
		 boolean allPositive = numbers.stream()
				               .allMatch(n -> n > 0);
		 System.out.println(allPositive);
		 //allMatch returns true if every element in the stream matches the given predicate.
		 
		 //12. None Match-Check if there are no negative numbers in a list.
		 boolean nonNegitive = numbers.stream()
				               .noneMatch(n -> n < 0);
		 
		 System.out.println(nonNegitive);	                   
		//noneMatch checks that no elements match the negative condition.		                   
			
		 //13.Find First
		 //Find the first element in a list of integers.
		 Optional<Integer> first = numbers.stream()
				                           .findFirst();
		 System.out.println(first);		                   
		 //findFirst returns the first element of the stream, wrapped in an Optional.		                   
				                   
		//14. FlatMap for Nested Lists
		//Flatten a nested list structure.
		 List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5)); 
		 List<Integer> flatList =nestedNumbers.stream()
				                    .flatMap(List::stream)
				                    .collect(Collectors.toList());
		System.out.println(flatList);
		System.out.println(nestedNumbers);		                   
		//flatMap converts each element into its own stream and then merges them into a single stream.		                   
	   // 15. Grouping Elements - Group users by age.
		class User {
		    private String name;
		    private int age;

		    // Constructor
		    public User(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    // Getter methods
		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    // toString() for easy printing
		    @Override
		    public String toString() {
		        return name + " (" + age + ")";
		    }
		}
		List<User> users = Arrays.asList(
	            new User("Alice", 30),
	            new User("Bob", 25),
	            new User("Charlie", 30),
	            new User("David", 25),
	            new User("Eve", 35)
	        );
		Map<Integer,List<User>> userByAge = users.stream()
				                            .collect(Collectors.groupingBy(User::getAge));
		System.out.println(userByAge);
		//The groupingBy collector groups elements based on the age property, creating a map where each key is an age and each value is a list of users with that age.
		
		
		//16. Peek Elements
		//Print elements of a stream during processing without altering the stream.
		List<Integer> peekedAtNumbers = numbers.stream()
				                        .peek(System.out::println)
				                        .collect(Collectors.toList());
		
		//peek is used for debugging or performing actions without changing the stream. It prints each element before passing it along the stream.
		
		//17. Limit Stream - Limit the output to the first 3 elements of the list.
		List<Integer> limited = numbers.stream()
				                .limit(3)
				                .collect(Collectors.toList());
		System.out.println(limited);
		//limit truncates the stream to be no longer than the specified size.
		
		//18.Skip Elements
		//Skip the first 2 elements of a list and return the rest.
		List<Integer> skipped = numbers.stream()
				                .skip(2)
				                .collect(Collectors.toList());
		System.out.println(skipped);
		//skip discards the first n elements of the stream.
		
		//19. Convert to Set
		//Convert a list of integers to a set to remove duplicates.
		Set<Integer> uniqueNumbers = numbers.stream()
				                     .collect(Collectors.toSet());
	  //Collecting the stream into a Set automatically removes duplicates.
	
	  /*   //20. Summarizing Statistics
		//Get summary statistics for a list of integers.
		intSummaryStatistics stats = numbers.stream()
				                    .mapToInt(Integer::intValue)
				                    .summaryStatistics();
		//summaryStatistics provides a summary (max, min, average, sum, count) for a stream of integers.
      */
	}
}
