package com.practice;

public class CountOfZeros {

	public static void main(String[] args) {
		int num = 102030004;
		int count = countZeros(num);
		System.out.println("Number of zeros in" + num + " =" + count);
	}

	static int countZeros(int n) {
		// Base case: if number becomes 0
		if (n == 0) {
			return 0;
		}

		// Check last digit
		int lastDigit = n % 10;

		// if last digit is zero, add 1, else 0
		if (lastDigit == 0) {
			return 1 + countZeros(n / 10);
		} else {
			return countZeros(n / 10);
		}
	}
}
