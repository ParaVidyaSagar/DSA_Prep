package com.deadlock;

//this class is shared by both threads
class Shared {

 // first synchronized method
 synchronized void test1(Shared s2)
 {
     System.out.println(Thread.currentThread().getName()
                        + " enters test1 of " + this);
     Util.sleep(1000);
   
     // Trying to call test2 
     // on another object
     s2.test2();
     System.out.println(Thread.currentThread().getName()
                        + " exits test1 of " + this);
 }

 // Second synchronized method
 synchronized void test2()
 {
     System.out.println(Thread.currentThread().getName()
                        + " enters test2 of " + this);
     Util.sleep(1000);
   
     // taking object lock of s1 enters
     // into test1 method
     System.out.println(Thread.currentThread().getName()
                        + " exits test2 of " + this);
 }
} 