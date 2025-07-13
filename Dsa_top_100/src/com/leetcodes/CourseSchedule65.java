package com.leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule65 {
	public static class Solution {

	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        int[] inDegree = new int[numCourses];
	        List<List<Integer>> graph = new ArrayList<>();

	        for (int i = 0; i < numCourses; i++)
	            graph.add(new ArrayList<>());

	        for (int[] pre : prerequisites) {
	            graph.get(pre[1]).add(pre[0]); // b → a
	            inDegree[pre[0]]++;
	        }

	        Queue<Integer> queue = new LinkedList<>();
	        for (int i = 0; i < numCourses; i++)
	            if (inDegree[i] == 0)
	                queue.offer(i);

	        int visited = 0;

	        while (!queue.isEmpty()) {
	            int course = queue.poll();
	            visited++;

	            for (int neighbor : graph.get(course)) {
	                inDegree[neighbor]--;
	                if (inDegree[neighbor] == 0)
	                    queue.offer(neighbor);
	            }
	        }

	        return visited == numCourses;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int numCourses1 = 2;
	        int[][] prerequisites1 = { {1, 0} };
	        System.out.println("Can finish all courses? " + solution.canFinish(numCourses1, prerequisites1)); // true

	        int numCourses2 = 2;
	        int[][] prerequisites2 = { {1, 0}, {0, 1} };
	        System.out.println("Can finish all courses? " + solution.canFinish(numCourses2, prerequisites2)); // false
	    }
	}
}
