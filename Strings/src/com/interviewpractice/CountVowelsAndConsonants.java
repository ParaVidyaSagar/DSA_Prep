package com.interviewpractice;

public class CountVowelsAndConsonants {
  public static void main(String[] args) {
	  countVowelsAndConsonants("2eiou");
}
  static void countVowelsAndConsonants(String s) {
	String  str = s.toLowerCase();
	int vowels = 0;
	int consonants = 0;
	for(char c : s.toCharArray()) {
		if(Character.isLetter(c)) {
			if("aeiou".indexOf(c) != -1) {
				vowels++;
			}else {
				consonants++;
			}
		}
	}
	System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
  
  }
}
