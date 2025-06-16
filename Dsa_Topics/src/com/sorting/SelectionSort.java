package com.sorting;
// it will traverse through unsorted array and move smalllest element to first again will start from first

public class SelectionSort {

	
	public static void main(String[] args) {
		int[] arr = {78,6,52,36,8,6,6,2,3,43};
		System.out.println("Before Sorting:");
		printArray(arr);
		selectionSort(arr);
		System.out.println("After Sorting:");
		printArray(arr);
	}
	
	static void selectionSort(int[] arr) {
		int n = arr.length;
	  for(int i =0; i< n-1; i++) {
		  int minIndex = i;
		  for(int j = i+1; j<n;j++) {
			  if(arr[j]<arr[minIndex]) {
				  minIndex = j;
			  }
		  }
		  
		  //swapping 
		  int temp = arr[i];
		  arr[i] = minIndex; // minIndes is arr[j]
		  minIndex = temp;
	  }
	 }
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
