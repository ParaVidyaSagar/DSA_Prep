package com.leetcodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision94 {
	

	static class Solution {
	    private Map<String, Map<String, Double>> graph = new HashMap<>();

	    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
	        // Step 1: Build graph
	        for (int i = 0; i < equations.size(); i++) {
	            String a = equations.get(i).get(0);
	            String b = equations.get(i).get(1);
	            double k = values[i];

	            graph.putIfAbsent(a, new HashMap<>());
	            graph.putIfAbsent(b, new HashMap<>());
	            graph.get(a).put(b, k);
	            graph.get(b).put(a, 1.0 / k);
	        }

	        // Step 2: Process each query using DFS
	        double[] results = new double[queries.size()];
	        for (int i = 0; i < queries.size(); i++) {
	            String start = queries.get(i).get(0);
	            String end = queries.get(i).get(1);
	            Set<String> visited = new HashSet<>();
	            results[i] = dfs(start, end, visited);
	        }

	        return results;
	    }

	    private double dfs(String start, String end, Set<String> visited) {
	        if (!graph.containsKey(start)) return -1.0;
	        if (start.equals(end)) return 1.0;

	        visited.add(start);

	        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
	            String next = neighbor.getKey();
	            if (!visited.contains(next)) {
	                double result = dfs(next, end, visited);
	                if (result != -1.0) {
	                    return result * neighbor.getValue();
	                }
	            }
	        }

	        return -1.0;
	    }
	}
	 public static void main(String[] args) {
	        Solution sol = new Solution();

	        List<List<String>> equations = List.of(
	                List.of("a", "b"),
	                List.of("b", "c")
	        );

	        double[] values = {2.0, 3.0};

	        List<List<String>> queries = List.of(
	                List.of("a", "c"),
	                List.of("b", "a"),
	                List.of("a", "e"),
	                List.of("a", "a"),
	                List.of("x", "x")
	        );

	        double[] results = sol.calcEquation(equations, values, queries);
	        System.out.println("Results: " + Arrays.toString(results));
	        // Output: [6.0, 0.5, -1.0, 1.0, -1.0]
	    }
}
