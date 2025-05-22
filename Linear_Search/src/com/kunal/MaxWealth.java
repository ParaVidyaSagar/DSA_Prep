package com.kunal;

public class MaxWealth {
 // 1672 - https://leetcode.com/problems/richest-customer-wealth/description/
	public static void main(String[] args) {
		int[][] accounts = {
				{1,2,3},
				{3,2,1}
		};
		
		System.out.println(maxWealth(accounts));
		}
	
	static int maxWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for(int[] ints : accounts) {
			// when you start a new row, take a new sum for that row
			int sum =0;
			for(int anInt:ints) {
				sum+=anInt;
				
			}
			// now we have sum of accounts of person
			// check with overall ans
			if(sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}
	
}
