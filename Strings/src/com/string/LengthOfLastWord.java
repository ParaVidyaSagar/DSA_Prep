package com.string;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "fly to the moon";
		System.out.println(LengthOfLastWord(s));
	}
	
	static int LengthOfLastWord(String s) {
		String str = s.trim();
		int count = 0;
		for(int i =str.length()-1; i>0; i--) {
			if(str.charAt(i) != ' ') {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
