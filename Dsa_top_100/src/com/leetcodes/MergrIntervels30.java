package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergrIntervels30 {
    static class Solution{
    	public int[][] merge(int[][] intervals){
    		if(intervals.length <= 1) return intervals;
    		// Sort intervals by starting time
    		Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
    	    List<int[]> result = new ArrayList<>();
    	    int[] newInterval = intervals[0];
    	    result.add(newInterval);
    	    for(int[] interval : intervals) {
    	    	if(interval[0] <= newInterval[1]) {
    	    		newInterval[1] = Math.max(newInterval[1], interval[1]);
    	    		
    	    	}else {
    	    		newInterval = interval;
    	    		result.add(newInterval);
    	    	}
    	    }
    	return result.toArray(new int[result.size()][]);
    	}
    	
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] intervals = {
				{1,3},
				{2,6},
				{8,10},
				{15,18}
		};
		
		int[][] merged = sol.merge(intervals);
		System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
	}
}










/*
 Code Explanation:-
 🔧 Problem:
You are given an array of intervals intervals, where intervals[i] = [start, end].
Merge all overlapping intervals, and return the resulting array.

🧠 Logic Behind the Code:
🔹 Step 1: Return early if ≤ 1 interval
java
Copy code
if (intervals.length <= 1) return intervals;
If there are 0 or 1 intervals, there's nothing to merge.

🔹 Step 2: Sort the intervals by start time
java
Copy code
Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
Sorting ensures we process intervals in left-to-right order (based on their start times).

After sorting, overlapping intervals will always be adjacent.

🔹 Step 3: Initialize result list
java
Copy code
int[] newInterval = intervals[0];
List<int[]> result = new ArrayList<>();
result.add(newInterval);
Start with the first interval, and assume it's our "current merged interval".

We'll compare it with others to either merge or add new ones.

🔹 Step 4: Iterate and Merge Intervals
java
Copy code
for (int[] interval : intervals) {
    if (interval[0] <= newInterval[1]) {
        // Overlap → merge by updating the end of newInterval
        newInterval[1] = Math.max(newInterval[1], interval[1]);
    } else {
        // No overlap → start a new interval
        newInterval = interval;
        result.add(newInterval);
    }
}
Explanation:

If the current interval starts before or at the end of the previous (interval[0] <= newInterval[1]), then there's an overlap. Merge it by extending the end.

If there's no overlap, treat the current interval as a new one and add it to the result list.

🔹 Step 5: Convert List to Array and Return
java
Copy code
return result.toArray(new int[result.size()][]);
The result list contains merged intervals. We convert it back to a 2D array to match return type.

🔁 Example:
Input:

java
Copy code
intervals = [[1,3], [2,6], [8,10], [15,18]]
Sorted:

lua
Copy code
[[1,3], [2,6], [8,10], [15,18]]
 
*/
