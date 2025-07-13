package com.leetcodes;

public class MedianOfTwoSortedArrays74 {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        if (nums1.length > nums2.length)
	            return findMedianSortedArrays(nums2, nums1);

	        int m = nums1.length, n = nums2.length;
	        int left = 0, right = m;

	        while (left <= right) {
	            int partitionX = (left + right) / 2;
	            int partitionY = (m + n + 1) / 2 - partitionX;

	            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
	            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

	            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
	            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

	            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
	                if ((m + n) % 2 == 0) {
	                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
	                } else {
	                    return Math.max(maxLeftX, maxLeftY);
	                }
	            } else if (maxLeftX > minRightY) {
	                right = partitionX - 1;
	            } else {
	                left = partitionX + 1;
	            }
	        }

	        throw new IllegalArgumentException("Input arrays are not sorted.");
	    }

	    public static void main(String[] args) {
	    	MedianOfTwoSortedArrays74 sol = new MedianOfTwoSortedArrays74();

	        int[] nums1 = {1, 3};
	        int[] nums2 = {2};

	        double median = sol.findMedianSortedArrays(nums1, nums2);
	        System.out.println("Median: " + median); // Output: 2.0

	        int[] nums3 = {1, 2};
	        int[] nums4 = {3, 4};

	        System.out.println("Median: " + sol.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
	    }
}
