package com.leetcodes;

public class MaximumProductSubarray44 {
  static class Solution{
	  public int maxProduct(int[] nums) {
		  if(nums== null || nums.length == 0) return 0;
		  int maxProduct = nums[0];
		  int currentMax = nums[0];
		  int currentMin = nums[0];  // Needed to handle negative values
	  
		  for(int i =1; i < nums.length; i++) {
			  int tempMax = currentMax;
			 currentMax = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
			 currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], currentMin * nums[i]));
			 maxProduct = Math.max(maxProduct, currentMax);
		  }
		  return maxProduct;
	  }
  }
  
  public static void main(String[] args) {
	  Solution solution = new Solution();

      int[] nums1 = {2, 3, -2, 4};
      int[] nums2 = {-2, 0, -1};
      int[] nums3 = {-2, 3, -4};
      int[] nums4 = {0, 2};
      int[] nums5 = {-1, -2, -3};

      System.out.println("Max product (nums1): " + solution.maxProduct(nums1)); // 6
      System.out.println("Max product (nums2): " + solution.maxProduct(nums2)); // 0
      System.out.println("Max product (nums3): " + solution.maxProduct(nums3)); // 24
      System.out.println("Max product (nums4): " + solution.maxProduct(nums4)); // 2
      System.out.println("Max product (nums5): " + solution.maxProduct(nums5)); // 6
}
}
