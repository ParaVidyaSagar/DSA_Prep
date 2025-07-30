package com.interviewpractice;

import java.util.Arrays;

public class RotateByKTimes {
 public static void main(String[] args) {
	 int[] arr = {1, 2, 3, 4, 5};
     int k = 2;
     rotateRight(arr, k);
     System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]
}
 static void rotateRight(int[] arr, int k) {
	 int n = arr.length;
	 k = k %n;
	 reverse(arr, 0, n-1);// Step 1: Reverse entire array
	 reverse(arr,0,k-1);// Step 2: Reverse first K elements
	 reverse(arr, k,n-1);// Step 3: Reverse the rest
 }
 static void reverse(int[] arr, int start, int end) {
	 while(start<end) {
		 int temp = arr[start];
		 arr[start]= arr[end];
		 arr[end] = temp;
		 start++;
		 end--;
	 }
 }
}
