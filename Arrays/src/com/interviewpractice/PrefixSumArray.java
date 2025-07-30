package com.interviewpractice;

public class PrefixSumArray {
	 static int[] prefixSum;
 public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	buildPrefix(arr);
	System.out.println(sumRange(1, 3)); // Output: 9
    System.out.println(sumRange(0, 4)); // Output: 15
}
 // Preprocessing: Build prefix sum array
 static void buildPrefix(int[] arr) {
	 int n = arr.length;
	 prefixSum = new int[n];
	 prefixSum[0] = arr[0];
	 for(int i =1; i<n; i++) {
		 prefixSum[i] = prefixSum[i -1]+arr[i];
	 }
 }
 
//Answer sum from l to r (inclusive) in O(1)
 public static int sumRange(int l, int r) {
	 if(l==0) 
		 return prefixSum[r];
	 return prefixSum[r]- prefixSum[l-1];
	 
 }
}
