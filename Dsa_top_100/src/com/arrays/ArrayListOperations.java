package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListOperations {
  public static void main(String[] args) {
	// --- Basic Operations ---
	//1. ArrayList<E>() - Constructor creates empty list 
	ArrayList<String> list = new ArrayList<>(); // Empty constructor
	list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    System.out.println("Initial list: " + list);
	
    //2.ArrayList<E>(Collection<? extends E> c) - Constructor with collection 
     ArrayList<String> copyList = new ArrayList<>(list); 
     System.out.println("Copied list: " + copyList);
    
    //3.size() - Returns number of elements
     System.out.println("Size: " + list.size());
    
     //4.isEmpty() - Checks if list contains no elements
     System.out.println("Is empty? " + list.isEmpty());
    
     //5.get(int index) - Returns element at position
     System.out.println("Element at index 1: " + list.get(1));
    
     //6.set(int index, E element) - Replaces element at position
     list.set(1, "Blueberry"); // Replace at index 1
     System.out.println("After set: " + list);
    
     //7.add(E e) - Appends element to end
     list.add("Date"); // Append
     System.out.println("After add: " + list);
     
     //8.add(int index, E element) - Inserts element at position
     list.add(2, "Elderberry"); // Insert at index
     System.out.println("After insert at index 2: " + list);
     
     //9.remove(int index) - Removes element at position
     list.remove(3); // Remove by index
     System.out.println("After remove at index 3: " + list);
     
     //10.remove(Object o) - Removes first occurrence of element
     list.remove("Apple"); // Remove by object
     System.out.println("After remove object 'Apple': " + list);
     
     //11.clear() - Removes all elements
     list.clear(); // Remove all
     System.out.println("After clear: " + list);
     
     // Refill for further demos
     list.addAll(Arrays.asList("Mango", "Peach", "Grape", "Peach", "Kiwi"));
     System.out.println("\nRefilled list: " + list);
    
     // --- Searching ---
     //1. contains(Object o) - Returns true if list contains element
     System.out.println("Contains 'Peach'? " + list.contains("Peach"));
     
     //2.indexOf(Object o) - Index of first occurrence or -1
     System.out.println("Index of 'Peach': " + list.indexOf("Peach"));
     
     //3.lastIndexOf(Object o) - Index of last occurrence or -1
     System.out.println("Last index of 'Peach': " + list.lastIndexOf("Peach"));
     
     // --- Bulk Operations ---
    //1. addAll(Collection<? extends E> c) - Appends all elements
     List<String> extraFruits = Arrays.asList("Pineapple", "Mango", "Lime");
     list.addAll(extraFruits);
     System.out.println("After addAll: " + list);
     
     //2. addAll(int index, Collection<? extends E> c) - Inserts all at index
     list.addAll(2, Arrays.asList("Strawberry", "Guava"));
     System.out.println("After addAll at index 2: " + list);

     //3.removeAll(Collection<?> c) - Removes all elements in c
     list.removeAll(Arrays.asList("Peach", "Kiwi"));
     System.out.println("After removeAll: " + list);
     
     //4. retainAll(Collection<?> c) - Retains only elements in c
     list.retainAll(Arrays.asList("Mango", "Lime", "Guava")); // Keep only these
     System.out.println("After retainAll: " + list);
     
     //5.containsAll(Collection<?> c) - True if contains all elements
     System.out.println("Contains all? " + list.containsAll(Arrays.asList("Mango", "Lime")));

     // --- List Views ---
     //subList(int fromIndex, int toIndex) - Returns view of portion
     List<String> subList = list.subList(0, 2); // View from 0 (inclusive) to 2 (exclusive)
     System.out.println("SubList (0 to 2): " + subList);
     
     // --- Java 8+ Enhancements ---
     //1.stream() - Returns a sequential Stream
     System.out.print("Stream(): ");
     list.stream().forEach(e -> System.out.print(e + " "));
     System.out.println();

     //2. forEach(Consumer<? super E> action) - Performs action for each element
     System.out.print("forEach(): ");
     list.forEach(e -> System.out.print(e + " "));
     System.out.println();
     
     //3.removeIf(Predicate<? super E> filter) - Removes all elements matching predicate
     list.removeIf(e -> e.startsWith("G")); // Remove items starting with 'G'
     System.out.println("After removeIf startsWith 'G': " + list);
     
     //4.sort(Comparator<? super E> c) - Sorts list with provided comparator
     list.sort(Comparator.naturalOrder()); // Sort alphabetically
     System.out.println("After sort: " + list);
}
}
