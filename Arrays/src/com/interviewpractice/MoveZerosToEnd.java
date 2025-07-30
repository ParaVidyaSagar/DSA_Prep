package com.interviewpractice;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		moveZerosToEnd(arr);
        System.out.println("Output: " + Arrays.toString(arr));
	}
	static void moveZerosToEnd(int[] arr) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		 // Fill remaining elements with zero
		while(index<arr.length) {
			arr[index++] = 0;
		}
	}

}
