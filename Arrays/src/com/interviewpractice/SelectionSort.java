package com.interviewpractice;

public class SelectionSort {
  public static void main(String[] args) {
	int[] arr = {4, 1, 3};
	selectionSort(arr);
	System.out.println("Selection Sorted: "+ java.util.Arrays.toString(arr));
}
  static void selectionSort(int[] arr) {
	  int n = arr.length;
	  for(int i =0; i < n-1; i++) {
		  int minIndex = i;
		  for(int j = i+1; j<n; j++) {
			  if(arr[j] < arr[minIndex]) {
				  minIndex = j;
			  }
		  }
		  //swap
		  int temp = arr[i];
		  arr[i] =arr[minIndex];
		  arr[minIndex] = temp;
	  }
  }
}
