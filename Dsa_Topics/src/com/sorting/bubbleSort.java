package com.sorting;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int[] arr = {1,86,58,98,78};
		bubleSort(arr);
		//printing Array after sorting
		printArray(arr);
	}
	
	public static int[] bubleSort(int[] arr) {
		int n = arr.length;  //length of an Array
		/*
		 length is 5
		 but array index start from 0, so length-1
		 */
		
		for (int i =0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
				
			}
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
	}

}
