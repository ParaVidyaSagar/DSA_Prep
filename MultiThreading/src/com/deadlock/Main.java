package com.deadlock;

public class Main {
	// In this class deadlock occurs
    public static void main(String[] args)
    {
        // creating one object
        Shared s1 = new Shared();
        Shared s2 = new Shared();
      
        // creating first thread and starting it
        Thread1 t1 = new Thread1(s1, s2);
        t1.setName("Thread1");
        t1.start();
      
        // creating second thread and starting it
        Thread2 t2 = new Thread2(s1, s2);
        t2.setName("Thread2");
        t2.start();
        Util.sleep(2000);
    }
}

/*
Explanation:

Thread t1 starts by acquiring a lock on the s1 and enters the test1() method of s1.
Thread t2 starts by acquiring a lock on the s2 and enters the test1() method of s2.
In the test1() method both threads try to acquire locks on each other's objects but the locks are already held by the other thread causing both threads to wait indefinitely for the other to release the lock.
Neither test1() nor test2() methods complete execution and the program remains stuck in the deadlock state.
*/