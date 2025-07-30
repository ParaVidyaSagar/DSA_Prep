package com.interviewpractice;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3 };
		int[] result = removeDuplicates(arr);
		System.out.println("Array after removing duplicates: " + Arrays.toString(result));

	}
  static int[] removeDuplicates(int[] arr) {
	  if(arr.length == 0) return new int[0];
	  int uniqueCount = 1;
	  for(int i = 1; i<arr.length;i++) {
		  if(arr[i] != arr[uniqueCount -1]) {
			  arr[uniqueCount] = arr[i];
			  uniqueCount++;
		  }
	  }
	  // Copy only the unique portion of the array
	  return Arrays.copyOfRange(arr,0, uniqueCount);
  }
}
