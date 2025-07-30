package com.interviewpractice;

import java.util.HashMap;

public class TwoSum {
 public static void main(String[] args) {
	 int[] arr = {2, 7, 11, 15};
     int target = 9;
     int[] result = findTwoSum(arr, target);
     
     if (result.length == 2) {
         System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
     } else {
         System.out.println("No pair found.");
     }
     
     
}
 static int[] findTwoSum(int[] arr, int target) {
	 HashMap<Integer, Integer> map = new HashMap<>();  // value -> index

     for (int i = 0; i < arr.length; i++) {
         int complement = target - arr[i];

         if (map.containsKey(complement)) {
             return new int[] { map.get(complement), i };
         }

         map.put(arr[i], i);
     }

     return new int[] {};  // No solution
 }
}
