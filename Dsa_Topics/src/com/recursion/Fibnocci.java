package com.recursion;

public class Fibnocci {
	static int count = 2;
	public static void main(String[] args) {
		int prev2 =0;
		int prev1 = 1;
		System.out.println(prev2); // print first Fibonacci number
        System.out.println(prev1); // print second Fibonacci number
        fibnocci(prev2, prev1);
	}
	
	static void fibnocci(int prev2, int prev1) {
		if(count <= 19) {
			int newfib = prev2+prev1;
			System.out.println(newfib);
			prev2 = prev1;
			prev1=newfib;
			count++;
			fibnocci(prev2, prev1);
		}else {
			return;
		}
		
	}

}
