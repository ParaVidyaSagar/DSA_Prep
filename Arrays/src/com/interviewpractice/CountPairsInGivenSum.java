package com.interviewpractice;

import java.util.HashMap;

public interface CountPairsInGivenSum {
  public static void main(String[] args) {
	  int[] arr = {1, 5, 7, -1};
      int sum = 6;
      int count = countPairs(arr, sum);
      System.out.println("Number of pairs: " + count);
}
  static int countPairs(int[] arr, int sum) {
	  HashMap<Integer, Integer> map = new HashMap<>();
	  int count =0;
	  for(int num : arr) {
		  int complement = sum-num;
		// if complement exists in map, we found that many pairs
		  if(map.containsKey(complement)) {
			  count += map.get(complement);
		  }
		  // update frequency of current number
		  map.put(num, map.getOrDefault(num, 0)+1);
	  }
	  return count;
  }
}
