package com.leetcodes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
  public static void main(String[] args) {
	  //return two indices which add up together make target
	  //https://leetcode.com/problems/two-sum/
	int[] arr = {2,7,11,15};
	int target = 18;
	int[] result = twoSum(arr, target);
    
    if (result.length == 2) {
        System.out.println("Indices: " + Arrays.toString(result));
    } else {
        System.out.println("No solution found.");
    }
}
  
  static int[] twoSum(int[] nums,int target) {
	  HashMap<Integer, Integer> hashMap = new HashMap<>();
	  for(int i=0;i<nums.length; i++) {
		  int compliment = target - nums[i];
		  if(hashMap.containsKey(compliment)) {
			  return new int[] {hashMap.get(compliment),i};
		  }
		  hashMap.put(nums[i], i);
	  }
	  return new int[] {};
	  
  }
}
