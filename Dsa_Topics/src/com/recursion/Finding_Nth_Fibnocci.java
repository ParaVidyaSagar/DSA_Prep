package com.recursion;

/*
 F(4)
= F(3) + F(2)
= (F(2) + F(1)) + (F(1) + F(0))
= ((F(1) + F(0)) + 1) + (1 + 0)
= ((1 + 0) + 1) + 1
= (1 + 1) + 1
= 2 + 1
= 3
F(n) =F(n−1)+F(n−2)
 */

public class Finding_Nth_Fibnocci {
	
	public static void main(String[] args) {
		System.out.println(fibnocci(5));
	}
	
	static int fibnocci(int n) {
		if(n<=1) {
		return n;
		
	}else {
		return fibnocci(n-1)+fibnocci(n-2);
	}
	}

}
