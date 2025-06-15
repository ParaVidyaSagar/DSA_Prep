package com.sorting;
/*
1. An array with values to sort.
2. An inner loop that goes through the array, finds the lowest value, and moves it to the front of the array. This loop must loop through one less value each time it runs.
3. An outer loop that controls how many times the inner loop must run. For an array with n values, this outer loop must run n−1 times.
 
 
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] my_array = {64, 34,2,5,6,90,3};
		int n = my_array.length;
		for(int i =0; i< n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(my_array[j] < my_array[min_index]) {
					min_index = j;
				}
			}
			
			int min_value = my_array[min_index];
			for(int k=min_index;k > i; k--) {
				my_array[k] = my_array[k-1];
			}
			my_array[i] = min_value;
		}
		
		System.out.println("Sorted Array: ");
		for(int i =0; i < n; i++) {
			System.out.print(my_array[i]+" ");
		}
//		System.out.println();
	}
	

}
