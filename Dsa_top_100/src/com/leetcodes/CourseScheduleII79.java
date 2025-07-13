package com.leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII79 {
	static class Solution {
	    public int[] findOrder(int numCourses, int[][] prerequisites) {
	        List<List<Integer>> graph = new ArrayList<>();
	        int[] indegree = new int[numCourses];

	        // Initialize graph
	        for (int i = 0; i < numCourses; i++) {
	            graph.add(new ArrayList<>());
	        }

	        // Build graph and indegree array
	        for (int[] pre : prerequisites) {
	            int course = pre[0];
	            int prereq = pre[1];
	            graph.get(prereq).add(course);
	            indegree[course]++;
	        }

	        // Queue for courses with no prerequisites
	        Queue<Integer> queue = new LinkedList<>();
	        for (int i = 0; i < numCourses; i++) {
	            if (indegree[i] == 0) queue.offer(i);
	        }

	        int[] order = new int[numCourses];
	        int index = 0;

	        while (!queue.isEmpty()) {
	            int curr = queue.poll();
	            order[index++] = curr;

	            for (int neighbor : graph.get(curr)) {
	                indegree[neighbor]--;
	                if (indegree[neighbor] == 0) queue.offer(neighbor);
	            }
	        }

	        return index == numCourses ? order : new int[0];
	    }
	}

	public static void main(String[] args) {
        Solution sol = new Solution();
        
        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        
        int[] result = sol.findOrder(numCourses, prerequisites);
        
        System.out.print("Course order: ");
        for (int course : result) {
            System.out.print(course + " ");
        }
        // Possible output: 0 2 1 3 or 0 1 2 3
    }
}
