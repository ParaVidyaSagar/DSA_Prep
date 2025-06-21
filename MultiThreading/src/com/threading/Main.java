package com.threading;

public class Main {

	 public static void main(String[] args) {
		int n =8; // no.of threads
		for(int i=0; i<n; i++) {
			MultiThreading multi = new MultiThreading();
			Thread multi2 = new Thread(new RunnableImpl());
			multi.start();
			multi2.start();
		}
		
	}
}
