package com.interviewpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {
 public static void main(String[] args) {
	int[] arr = {2,3,1,2,3};
	List<Integer> duplicates = findDuplicates(arr);
	System.out.println("Duplicates: " + duplicates);
}
 static List<Integer> findDuplicates(int[] arr){
	 Set<Integer> seen = new HashSet<>();
	 Set<Integer> dupes = new HashSet<>();
     for(int num : arr) {
    	 if(!seen.add(num)) {
    		 dupes.add(num);
    	 }
     }
     return new ArrayList<>(dupes);
 }
 
 
}
