package com.interviewpractice;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		reverse(arr);
		System.out.println("Reversed array: "+ Arrays.toString(arr));
	}
	
  static void reverse(int[] arr) {
	  int i =0;
	  int j = arr.length-1;
	  while(i < j) {
		  int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
		  i++;
		  j--;
	  }
  }
}
