package com.leetcodes;

public class ClimbingStairs20 {
  static class Solution{
	  public int climbStairs(int n) {
		  if( n <=2) return n;
		  int oneStepBefore = 2;
		  int twoStepBefore = 1;
		  int result = 0;
		  for(int i =3; i <= n; i++) {
			  result = oneStepBefore + twoStepBefore;
			  twoStepBefore = oneStepBefore;
			  oneStepBefore = result;
			  
		  }
		  return result;
	  }
	  
	  public static void main(String[] args) {
		  Solution solution = new Solution();
		  int n = 5;
		  int ways = solution.climbStairs(n);
		  System.out.println("Number of ways to climb " + n + " stairs: " + ways);  // Output: 8
	  }
  }
}
