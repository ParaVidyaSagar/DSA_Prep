package com.leetcodes;

import java.util.PriorityQueue;

public class KthLargestElementInTheArray40 {
  static class Solution{
	  public int findKthLargest(int[] nums, int k) {
		// Min-heap to store the top k largest elements
		  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		  for(int num : nums) {
			  minHeap.offer(num);
			  if(minHeap.size() > k) {
				  minHeap.poll();// Remove the smallest in the top k
			  }
		  }
		  return minHeap.peek();// Top of the heap is the kth largest
	  }
  }
  
  public static void main(String[] args) {
	Solution sol = new Solution();
	int[] nums = {3,2,1,5,6,4};
	int k = 2;
	int result = sol.findKthLargest(nums, k);
	System.out.println("Kth largest element is: " + result);// Output: 5
    
	int[] nums2 = {7,10,4,3,20,15};
	k =3;
	result = sol.findKthLargest(nums2, k);
	System.out.println("Kth largest element is: " + result);// Output: 10
}
}
