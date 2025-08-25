package com.practice;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int n = 3; // no .of disks
		solveHanoi(n, 'A', 'B', 'C');
	}

	static void solveHanoi(int n, char source, char auxilary, char destination) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + source + " to " + destination);
			return;
		}
		// Step 1: Move n-1 disks from source to auxiliary
		solveHanoi(n - 1, source, destination, auxilary);

		// Step 2: Move nth disk from source to destination
		System.out.println("Move disk " + n + " from " + source + " to " + destination);

		// Step 3: Move n-1 disks from auxiliary to destination
		solveHanoi(n - 1, auxilary, source, destination);

	}

}
