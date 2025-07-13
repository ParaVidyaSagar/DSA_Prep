package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements53 {
	public static class Solution {

	    public int[] topKFrequent(int[] nums, int k) {

	        Map<Integer, Integer> freqMap = new HashMap<>();
	        for (int num : nums) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        List<Integer>[] buckets = new List[nums.length + 1];
	        for (int key : freqMap.keySet()) {
	            int freq = freqMap.get(key);
	            if (buckets[freq] == null)
	                buckets[freq] = new ArrayList<>();
	            buckets[freq].add(key);
	        }

	        List<Integer> result = new ArrayList<>();
	        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
	            if (buckets[i] != null) {
	                result.addAll(buckets[i]);
	            }
	        }

	        int[] topK = new int[k];
	        for (int i = 0; i < k; i++)
	            topK[i] = result.get(i);
	        return topK;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] nums = {1, 1, 1, 2, 2, 3};
	        int k = 2;

	        int[] result = solution.topKFrequent(nums, k);

	        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
	    }
	}
}
