package com.interviewpractice;

public class InsertionSort {
  public static void main(String[] args) {
	int[] arr = {4,1,3};
	insertionSort(arr);
	System.out.println("Insertion Sorted: "+ java.util.Arrays.toString(arr));
}
  static void insertionSort(int[] arr) {
	  for(int i=1; i<arr.length; i++) {
		  int key = arr[i];
		  int j= i-1;
		  while( j >= 0 && arr[j]>key) {
			  arr[j+1] = arr[j];
			  j--;
		  }
		  arr[j+1] = key;
	  }
  }
}
