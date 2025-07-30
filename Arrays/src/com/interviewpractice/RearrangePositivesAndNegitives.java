package com.interviewpractice;

import java.util.Arrays;

public class RearrangePositivesAndNegitives {
 public static void main(String[] args) {
	 int[] arr = {1, -1, 3, -2};
     rearrange(arr);
     System.out.println(Arrays.toString(arr));
}
 static void rearrange(int[] arr) {
	 int left =0;
	 int right = arr.length-1;
	 while(left < right) {
		  // Move left if already negative
		 while(left<arr.length && arr[left]<0) left++;
		// Move right if already positive
		 while(right >=0 && arr[right] >= 0) right--;
		// Swap if left < right
		 if(left < right) {
			 int temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
		 }
	 }
 }
}
