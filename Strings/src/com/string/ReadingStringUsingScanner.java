package com.string;

import java.util.Scanner;

public class ReadingStringUsingScanner {
public static void main(String[] args) {
	// intailaise and decalare
	int id;
	String name;
	//create scanner class object
	Scanner scanner= new Scanner(System.in);
	//eneter the details
	System.out.print("Enter employee id: ");
	id = (scanner.nextInt());
    System.out.print("Enter employee name: ");
    name = (scanner.next());
    System.out.println("Id: "+ id+"\name : "+ name);
}
}
