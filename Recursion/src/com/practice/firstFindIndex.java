package com.practice;

public class firstFindIndex {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 3, 9 };
		int x = 3;
		int ans =findFirstIndex(arr, 0, x);
		System.out.println("First index of " + x + " is: " + ans);
	}
   static int findFirstIndex(int[] arr, int index, int x) {
	   // Base case: if index has reached end of array
	   if(index == arr.length) {
		   return -1;
	   }
	// If current element matches x, return this index
	   if(arr[index] == x) {
		   return index;
	   }
	   // Else recursively check in the rest of the array
	   return findFirstIndex(arr, index+1, x);
   }
}
