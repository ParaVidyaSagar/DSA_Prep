package com.strings;

public class StringBuilderMethodsOperations {
	public static void main(String[] args) {
        // Constructor: Empty StringBuilder
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Initial sb1 (empty): '" + sb1 + "'");
        System.out.println("Length: " + sb1.length());
        System.out.println("Capacity: " + sb1.capacity()); // Default is 16

        // Constructor: Initialized with String
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("\nInitial sb2: '" + sb2 + "'");
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity()); // 16 + initial string length

        // charAt, substring
        System.out.println("Char at index 1: " + sb2.charAt(1));
        System.out.println("Substring from index 2: " + sb2.substring(2));
        System.out.println("Substring from index 1 to 3: " + sb2.substring(1, 3));

        // append (all overloads not shown, just examples)
        sb2.append(" Programming");
        sb2.append(101);
        sb2.append(true);
        System.out.println("\nAfter appends: " + sb2);

        // insert
        sb2.insert(0, "Welcome to ");
        sb2.insert(11, 2025);
        System.out.println("After inserts: " + sb2);

        // delete
        sb2.delete(0, 11); // Remove "Welcome to "
        System.out.println("After delete(0,11): " + sb2);

        // deleteCharAt
        sb2.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb2);

        // replace
        sb2.replace(0, 4, "Core");
        System.out.println("After replace(0,4,\"Core\"): " + sb2);

        // setCharAt
        sb2.setCharAt(0, 'C');
        System.out.println("After setCharAt(0, 'C'): " + sb2);

        // reverse
        sb2.reverse();
        System.out.println("After reverse: " + sb2);

        // setLength (truncate or extend with nulls)
        sb2.setLength(10);
        System.out.println("After setLength(10): '" + sb2 + "'");
        sb2.setLength(20); // Adds '\u0000' null characters
        System.out.println("After setLength(20): '" + sb2 + "'");

        // toString
        String finalString = sb2.toString();
        System.out.println("Final string (toString): '" + finalString + "'");
    }
}
