package com.interviewpractice;

public class FindMinMaxElement {
  public static void main(String[] args) {
	int[] nums = {5,3,9,1,6};
	findMinAndMax(nums);
}
  static void findMinAndMax(int[] arr) {
	  if(arr == null || arr.length == 0) {
		  System.out.println("Array is empty.");
		  return;
	  }
	  
	  int min = arr[0];
	  int max = arr[0];
	  for(int i =1; i<arr.length; i++) {
		  if(arr[i]>max) {
			  max = arr[i];
		  }
		  if(arr[i]< min) {
			  min= arr[i];
		  }
	  }
	  System.out.println("Max: "+max + ", Min: " +min);
  }
  
}
