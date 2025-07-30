package com.interviewpractice;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		int n=5;
		int missing =findMissingNumber(arr,n);
		System.out.println("Missing number: " + missing);
	}
static int findMissingNumber(int[] arr, int n) {
	int expectedSum = n *(n+1) / 2;
	int actualSum = 0;
	for(int num: arr) {
		actualSum += num;
	}
	return expectedSum - actualSum;
}
}
