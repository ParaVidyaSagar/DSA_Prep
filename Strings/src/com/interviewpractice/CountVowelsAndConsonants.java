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
		//Character.isLetter(c) it will check wheter it is char or number 
		if(Character.isLetter(c)) {
			//"aeiou".indexOf(c) - it will check if aeiou is in c index- it will give true(1) else (-1)
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
