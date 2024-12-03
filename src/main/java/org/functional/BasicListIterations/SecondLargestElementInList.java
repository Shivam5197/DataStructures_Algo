package org.functional.BasicListIterations;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Example list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 55, 45);

        // Call method to find the second highest number
        int secondHighest = findSecondHighest(numbers);
        System.out.println("Second highest number: " + secondHighest);
	}
	
	
	 public static int findSecondHighest(List<Integer> numbers) {
	        if (numbers == null || numbers.size() < 2) {
	            throw new IllegalArgumentException("List must contain at least two elements.");
	        }

	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	        // Find the highest element
	        for (int number : numbers) {
	            if (number > highest) {
	                highest = number;
	            }
	        }

	        // Find the second highest element
	        for (int number : numbers) {
	            if (number > secondHighest && number < highest) {
	                secondHighest = number;
	            }
	        }

	        return secondHighest;
	    }

}
