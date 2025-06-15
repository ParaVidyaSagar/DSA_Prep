package com.time.complexity;

import java.util.HashMap;

public class TimeComplexity {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int[] arrray = {1,50,67,89,90};
		int target_index=50;
		hashMap.put(1, 56);
		hashMap.put(2,26);
		hashMap.put(3, 36);
		Integer key =2;
//		System.out.println(getElement(arrray,target_index));
//		System.out.println(getValue(hashMap,key));
//		System.out.println(binarSearch(arrray,target_index));
		System.out.println(linearSearch(arrray,target_index));
		System.out.println(sumArray(arrray));
		int left = 1;
		int right = 3;
		System.out.println();
	}
    //O(1) - Constant Time
	//Operations that take the same time regardless of input size.
	static int getElement(int[] arr,int  index) {
		return arr[index]; // O(1)
	}
	
	static int getValue(HashMap<Integer, Integer> map, Integer key) {
		 return map.get(key); // Average O(1)
	}
	
	//O(log n) - Logarithmic Time
	//Common in divide-and-conquer algorithms and binary search.
	//Binary Search
	static int binarSearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = left +(right-left)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<target )left = mid+1;
			else right = mid-1;
		}
		return -1;
	}
	
	//O(n) - Linear Time
	//Operations that process each element once
	// Linear Search
	static int linearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//// Sum of array elements
	static int sumArray(int[] arr) {
		int sum = 0;
		for(int num:arr) {
			sum+=num;
		}
		return sum;
	}
	
	//O(n log n) - Linearithmic Time
	//Common in efficient sorting algorithms.
	//Merge Sort
	// Merge Sort
	public void mergeSort(int[] arr, int left, int right) {
	    if (left < right) {
	        int mid = left + (right - left) / 2;
	        
	        mergeSort(arr, left, mid);      // T(n/2)
	        mergeSort(arr, mid + 1, right); // T(n/2)
	       // merge(arr, left, mid, right);   // O(n)
	    }
	    // Total: O(n log n)
	}

	
}
