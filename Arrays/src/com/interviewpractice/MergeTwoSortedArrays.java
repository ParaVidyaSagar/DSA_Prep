package com.interviewpractice;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(result));
	}
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2=arr2.length;
		int[] merged = new int[n1+n2];
		System.out.println(Arrays.toString(merged));
	    int i=0;
	    int j=0;
	    int k =0;
	    // Merge while both arrays have elements
	    while(i<n1 && j<n2) {
	    	if(arr1[i] < arr2[j]) {
	    		merged[k++] = arr1[i++];
	    		
	    	}else {
	    		merged[k++] = arr2[j++];
	    	}
	    }
	 // Copy remaining elements of arr1
	    while(i<n1) {
	    	merged[k++] = arr1[i++];
	    }
	 // Copy remaining elements of arr2
	    while (j < n2) {
            merged[k++] = arr2[j++];
        }
	    return merged;
	}

}
