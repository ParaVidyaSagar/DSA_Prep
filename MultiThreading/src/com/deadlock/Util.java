package com.deadlock;
// Utility class to pause thread execution
class Util { 
    static void sleep(long millis)
    {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}