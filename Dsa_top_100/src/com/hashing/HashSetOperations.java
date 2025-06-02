package com.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/*
 ashSet (and Set) Methods
Basic Operations
● HashSet<E>() - Constructor creates empty set
● HashSet<E>(Collection<? extends E> c) - Constructor with collection
● size() - Returns number of elements
● isEmpty() - Checks if set contains no elements
● add(E e) - Adds element if not present (returns boolean)
● remove(Object o) - Removes element if present
● clear() - Removes all elements
● contains(Object o) - Returns true if set contains element
Bulk Operations
LinkedIn: Japneet Sachdeva
● addAll(Collection<? extends E> c) - Adds all elements
● removeAll(Collection<?> c) - Removes all elements in c
● retainAll(Collection<?> c) - Retains only elements in c
● containsAll(Collection<?> c) - True if contains all elements
Iteration
● iterator() - Returns iterator over elements
Java 8+ Enhancements
● stream() - Returns a sequential Stream
● forEach(Consumer<? super E> action) - Performs action for each element
● removeIf(Predicate<? super E> filter) - Removes all elements matching predicate
 */

public class HashSetOperations {
	public static void main(String[] args) {
        // Constructor: Empty HashSet
		//HashSet<E>() - Constructor creates empty set
		//HashSet<E>(Collection<? extends E> c) - Constructor with collection
        HashSet<String> set1 = new HashSet<>();
        System.out.println("Initial set1 (empty): " + set1);

        // Basic add
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        System.out.println("After add: " + set1);

        // Duplicate add (returns false)
        boolean added = set1.add("Java");
        System.out.println("Attempt to add duplicate 'Java': " + added);
        System.out.println("Set after duplicate attempt: " + set1);

        // size() and isEmpty()
        System.out.println("Size of set1: " + set1.size());
        System.out.println("Is set1 empty? " + set1.isEmpty());

        // contains() and remove()
        System.out.println("Set contains 'Python'? " + set1.contains("Python"));
        set1.remove("Python");
        System.out.println("After removing 'Python': " + set1);

        // clear()
        HashSet<String> tempSet = new HashSet<>(set1); // copy for later
        set1.clear();
        System.out.println("After clear(): " + set1);

        // Constructor with Collection
        List<String> languages = Arrays.asList("Go", "Rust", "Kotlin");
        HashSet<String> set2 = new HashSet<>(languages);
        System.out.println("\nSet2 from collection: " + set2);

        // Bulk addAll
        set2.addAll(Arrays.asList("JavaScript", "TypeScript"));
        System.out.println("After addAll: " + set2);

        // Bulk containsAll
        System.out.println("set2 contains all ['Go', 'Rust']? " +
                set2.containsAll(Arrays.asList("Go", "Rust")));

        // Bulk removeAll
        set2.removeAll(Arrays.asList("Go", "Rust"));
        System.out.println("After removeAll ['Go', 'Rust']: " + set2);

        // Bulk retainAll
        set2.retainAll(Arrays.asList("JavaScript", "TypeScript"));
        System.out.println("After retainAll ['JavaScript', 'TypeScript']: " + set2);

        // Iterator
        //iterator() - Returns iterator over elements
        System.out.println("\nIterating over set2 using iterator:");
        Iterator<String> iterator = set2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Java 8+ forEach
        System.out.println("\nUsing forEach:");
        set2.forEach(element -> System.out.println("Language: " + element));

        // Java 8+ stream
        System.out.println("\nUsing stream (uppercase):");
        set2.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // Java 8+ removeIf
        set2.add("Angular");
        set2.removeIf(lang -> lang.contains("Script"));
        System.out.println("\nAfter removeIf(lang.contains(\"Script\")): " + set2);
    }
}
