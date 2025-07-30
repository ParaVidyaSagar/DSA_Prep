package com.interviewpractice;

public class SecondLargestElement {
public static void main(String[] args) {
	int[] nums = {2,8,6,4};
	int result = findSecondLargest(nums);
	if(result == Integer.MIN_VALUE) {
		System.out.println("Second Largest does not exist.");
	} else {
		System.out.println("Second largest: " + result);
	}
}

static int findSecondLargest(int[] arr) {
	if(arr == null || arr.length<2) return Integer.MIN_VALUE;
	int first = Integer.MIN_VALUE;
	int second = Integer.MAX_VALUE;
	for(int num : arr) {
		if(num > first) {
			second = first;
			first=num;
		} else if(num > second && num!= first) {
			second = num;
		}
	}
	return second;
}
}
