package com.interviewpractice;

public class PeakElement {
	public static void main(String[] args) {
		int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element: " + arr[peakIndex]);
	}
	static int findPeakElement(int[] arr) {
		int low =0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			boolean leftOk = (mid==0) || (arr[mid] >= arr[mid-1]);
			boolean rightOk =(mid == arr.length-1) || (arr[mid] >= arr[mid+1]);
			if(leftOk && rightOk) {
				return mid; // found a peak
			} else if (mid > 0 && arr[mid-1] > arr[mid]) {
				high = mid-1;// peak is on the left
			} else {
				low = mid+1;// peak is on the right
			}
		}
		return -1; // shouldn't reach here
	}
}
