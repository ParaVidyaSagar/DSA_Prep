package com.strings;

public class StringBuilderMethodsOperations {
	public static void main(String[] args) {
        // Constructor: Empty StringBuilder
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Initial sb1 (empty): '" + sb1 + "'");
        //length() - Returns length (character count)
        System.out.println("Length: " + sb1.length());
        //capacity() - Returns current capacity
        System.out.println("Capacity: " + sb1.capacity()); // Default is 16

        // Constructor: Initialized with String
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("\nInitial sb2: '" + sb2 + "'");
        //length() - Returns length (character count)
        System.out.println("Length: " + sb2.length());
      //capacity() - Returns current capacity
        System.out.println("Capacity: " + sb2.capacity()); // 16 + initial string length

        // charAt, substring
        // charAt(int index) - Returns char at specified index
        System.out.println("Char at index 1: " + sb2.charAt(1));
        //substring(int start) - Returns substring from start to end
        System.out.println("Substring from index 2: " + sb2.substring(2));
        //substring(int start, int end) - Returns substring from start to end-1
        System.out.println("Substring from index 1 to 3: " + sb2.substring(1, 3));

        // append (all overloads not shown, just examples)
        //append(X x) - Appends string representation of X (many overloads)
        sb2.append(" Programming");
        sb2.append(101);
        sb2.append(true);
        System.out.println("\nAfter appends: " + sb2);

        // insert
        //insert(int offset, X x) - Inserts string representation of X at position
        sb2.insert(0, "Welcome to ");
        sb2.insert(11, 2025);
        System.out.println("After inserts: " + sb2);

        // delete
        //delete(int start, int end) - Removes chars from start to end-1
        sb2.delete(0, 11); // Remove "Welcome to "
        System.out.println("After delete(0,11): " + sb2);

        // deleteCharAt
        //deleteCharAt(int index) - Removes char at specified position
        sb2.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb2);

        // replace
        //replace(int start, int end, String str) - Replaces substring
        sb2.replace(0, 4, "Core");
        System.out.println("After replace(0,4,\"Core\"): " + sb2);

        // setCharAt
        //setCharAt(int index, char ch) - Sets char at specified position
        sb2.setCharAt(0, 'C');
        System.out.println("After setCharAt(0, 'C'): " + sb2);

        // reverse
        //reverse() - Reverses the sequence
        sb2.reverse();
        System.out.println("After reverse: " + sb2);

        // setLength (truncate or extend with nulls)
        //setLength(int newLength) - Sets the length (truncates or adds null chars)
        sb2.setLength(10);
        System.out.println("After setLength(10): '" + sb2 + "'");
        sb2.setLength(20); // Adds '\u0000' null characters
        System.out.println("After setLength(20): '" + sb2 + "'");

        // toString
        //toString() - Converts to String
        String finalString = sb2.toString();
        System.out.println("Final string (toString): '" + finalString + "'");
    }
}
