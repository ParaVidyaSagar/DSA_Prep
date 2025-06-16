package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {7,56,98,8,4,2};
		System.out.println("Before sorting:");
        printArray(arr);
	    insertionSort(arr);
	    System.out.println("After sorting:");
        printArray(arr);
	}
	
	static void insertionSort(int[] arr) {
		int n= arr.length;
		for(int i =1; i < n ; i++) {
			int key = arr[i];
			int j= i-1;
			
			//shift elements greater than key to the right
			while(j >=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			
			}
			
 			arr[j+1] = key;
		}
	}
	
	 public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
}
