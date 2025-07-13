package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams38 {
	
	static class Solution{
		public List<List<String>> groupAnagrams(String[] strs){
			Map<String, List<String>> hashMap = new HashMap<>();
			
			for(String word : strs) {
				char[] chars = word.toCharArray();
				Arrays.sort(chars);
				String sortedWord = new String(chars);
				if(!hashMap.containsKey(sortedWord)) {
					hashMap.put(sortedWord, new ArrayList<>());
				}
				hashMap.get(sortedWord).add(word);
			}
			return new ArrayList<>(hashMap.values());
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = sol.groupAnagrams(input);
		for(List<String> group : result) {
			System.out.println(group);
			/*
			 output:
			 [eat, tea, ate]
			 [bat]
			 [tan, nat]
            */
		}
	}

}
