package com.arrays;
import java.util.*;
import java.util.stream.*;
public class ArraysEssentialMethods {

	
	public static void main(String[] args) {
		// --- Basic Operations ---
		//1.//Arrays.toString(array) - Returns string representation of array
		int [] intArray = {1,2,3,4,5};
		System.out.println("Arrays.toString(): " + Arrays.toString(intArray));
	
		//2.//Arrays.deepToString(Object[][] array) - For multi-dimensional arrays
	   String[][] string2DArray = {{"A","B"},
			                       {"C","D"}  };
	   System.out.println("Arrays.deepToString(): "+ Arrays.deepToString(string2DArray));
		
		//3. Arrays.equals(array1, array2) - Compares arrays for equality
	    int[] array1 = {1,2,3};
	    int[] array2 = {1,2,3};
	    System.out.println("Arrays.equals(): " + Arrays.equals(array1, array2));
		
	    //4.Arrays.deepEquals(Object[][] a1, Object[][] a2) - For multi-dimensional arrays
	    String[][] deepArray1 = {{"X", "Y"}, {"Z"}};
        String[][] deepArray2 = {{"X", "Y"}, {"Z"}};
        System.out.println("Arrays.deepEquals(): " + Arrays.deepEquals(deepArray1, deepArray2));
        System.out.println("Arrays.hashCode(): "+Arrays.hashCode(array1));
        System.out.println("Arrays.deepHashCode(): " + Arrays.deepHashCode(deepArray1));
        
        //--- Searching and Sorting ---
        //1. Arrays.sort(array) - Sorts array in ascending order
        int[] sortArray = {5, 3, 8, 1, 9};
        Arrays.sort(sortArray);
        System.out.println("Arrays.sort(): " + Arrays.toString(sortArray));
        
        //2. Arrays.sort(array, int fromIndex, int toIndex) - Sorts specified range
        int[] rangeSortArray = {10, 2, 6, 7, 4};
        Arrays.sort(rangeSortArray,1,4);
        System.out.println("Arrays.sort(range): " + Arrays.toString(rangeSortArray));
        
        //3. Arrays.sort(array, Comparator<? super T> c) - Sorts with custom comparator
        String[] names = {"Zack", "Anna", "John"};
        Arrays.sort(names,Comparator.comparing(String::toString));
        System.out.println("Arrays.sort with comparator: " + Arrays.toString(names));
        
        //4. Arrays.binarySearch(array, key) - Binary search on sorted array
        int[] searchArray = {1, 3, 5, 7, 9};
        System.out.println("Arrays.binarySearch(): " + Arrays.binarySearch(searchArray, 5));
        
        //5. Arrays.binarySearch(array, fromIndex, toIndex, key) - In specific range
        System.out.println("Arrays.binarySearch(range): " + Arrays.binarySearch(searchArray, 1, 4, 7));
      
        //6.Arrays.fill(array, val) - Fills entire array with specified value
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 42);
        System.out.println("Arrays.fill(): " + Arrays.toString(fillArray));
        
        //7. Arrays.fill(array, fromIndex, toIndex, val) - Fills range with value
        Arrays.fill(fillArray, 1,4,99);
        System.out.println("Arrays.fill(range): " + Arrays.toString(fillArray));
        
         // --- Array Conversion ---
        //1. Arrays.asList(T... a) - Converts array to fixed-size List
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("Arrays.asList(): " + fruitList);
        
        //2. Arrays.copyOf(original, newLength) - Copies and possibly resizes
        int[] original = {10, 20, 30};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("Arrays.copyOf(): " + Arrays.toString(copy));
        
        //3.Arrays.copyOfRange(original, from, to) - Copies specified range
        int[] copyRange = Arrays.copyOfRange(original, 1, 2);
        System.out.println("Arrays.copyOfRange(): " + Arrays.toString(copyRange));
        
        //// --- Java 8+ Enhancements ---
        //1. Arrays.stream(array) - Returns a sequential stream
        int[] streamArray = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(streamArray);
        System.out.print("Arrays.stream(): ");
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();
        
        //2. Arrays.parallelSort(array) - Sorts using multiple threads
        int[] parallelSortArray = {9, 4, 2, 8, 1};
        Arrays.parallelSort(parallelSortArray);
        System.out.println("Arrays.parallelSort(): " + Arrays.toString(parallelSortArray));
	}
	
	
}
