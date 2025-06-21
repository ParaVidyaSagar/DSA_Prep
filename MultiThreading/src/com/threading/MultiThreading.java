package com.threading;
// extending Thread class
public class MultiThreading extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println(
					"Thread with Runnable " + Thread.currentThread().getId() + " "+ "Is running" );
		} catch (Exception e) {
			//Throwing an exception
			System.out.println("Exception is caught");
		}
		
	}
	

}
