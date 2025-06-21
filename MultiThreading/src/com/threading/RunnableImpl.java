package com.threading;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 try {
	            // Displaying the thread that is running
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (Exception e) {
	            
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
		
	}

}
