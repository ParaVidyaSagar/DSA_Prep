package com.leetcodes;

public class NumberOf1Bits25 {
   static class Solution{
	   public int hammingWeight(int n){
	   int count = 0;
	   while( n != 0) {
		   n = n & (n-1);
		   count++;
	   }
	   return count;
    }
  }
   public static void main(String[] args) {
	Solution solution = new Solution();
	int n = 0b00000000000000000000000000001011;  // 11 in binary
	int result = solution.hammingWeight(n);
	System.out.println("Number of 1 bits: " + result);  // Output: 3
}
}
