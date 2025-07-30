package com.interviewpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateWordInASentence {
  public static void main(String[] args) {
	  String sentence = "Java is great and Java is fun";
	  List<String> duplicates = findDuplicateWords(sentence);
      System.out.println("Duplicate words: " + duplicates);
}
  
  static List<String> findDuplicateWords(String sentence){
	  String[] words= sentence.toLowerCase().split("\\s+");// split by space
	  Map<String, Integer> wordCount = new HashMap<>();
	  List<String> duplicates = new ArrayList<>();
	  for(String word: words) {
		  wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
	  }
	  for(Map.Entry<String, Integer> entry: wordCount.entrySet()) {
		  if(entry.getValue() > 1) {
			  duplicates.add(entry.getKey());
		  }
	  }
	  return duplicates;
   }
}
