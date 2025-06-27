package com.leetcodes;

import java.util.Arrays;

public class ReverseString15 {
  //https://leetcode.com/problems/reverse-string/submissions/1677951773/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	public static void main(String[] args) {
		Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before: " + Arrays.toString(input));
        solution.reverseString(input);
        System.out.println("After:  " + Arrays.toString(input));
	}
	
	static class Solution{
		public void reverseString(char[] s) {
			int left = 0;
			int right = s.length -1;
			
			while(left < right) {
				char temp = s[right];
				s[right]=s[left];
				s[left] = temp;
				left++;
				right--;
			}
			
		}
	}
	
}
