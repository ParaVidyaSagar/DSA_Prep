package com.leetcodes;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence72 {
	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int maxLen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int streak = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }

                maxLen = Math.max(maxLen, streak);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
    	LongestConsecutiveSequence72 sol = new LongestConsecutiveSequence72();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println("Longest consecutive length (nums1): " + sol.longestConsecutive(nums1)); // 4
        System.out.println("Longest consecutive length (nums2): " + sol.longestConsecutive(nums2)); // 9
    }
}
