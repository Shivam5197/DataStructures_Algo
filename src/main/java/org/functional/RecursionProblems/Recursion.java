package org.functional.RecursionProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        // Main method to run the program

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Number: ");
        Integer n = sc.nextInt(); // Input size of the array

        int[] initialArray = new int[n]; // Initialize the array of size n
        int[] finalarray = new int[n]; // Initialize the array of size n

        
        System.out.println("Please Enter the Array: ");
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = sc.nextInt(); // Input elements of the array
        }

        sc.close();
//        ReverseAnArray(initialArray, 0 , n-1); // Call method to reverse and print the array
//        System.out.println( missingNumber(n,initialArray));
        	System.out.println("Value of fibo is ::==>> "+fiboRecursive(5));
    }

    // Recursive method to print a name 'n' times
    public static void printNameNtimes(int i, int n) {

        // Base condition: stop when i is greater than n
        if (i > n) {
            return;
        }

        System.out.println("Name"); // Print name
        printNameNtimes(i + 1, n);  // Recursive call to print again with incremented i
    }

    // Recursive method to print numbers from 'n' to 1 (backtracking)
    public static void printNumberBacktrac(int i, int n) {

        // Base condition: stop when i is less than 1
        if (i < 1) {
            return;
        }

        System.out.println(i); // Print current number
        printNumberBacktrac(i - 1, n); // Recursive call to print the previous number
    }

    // Recursive method to compute the sum of all numbers from 'i' down to 0
    static void sumOfGivenNumbers(int i, int sum) {

        // Base condition: when i < 0, print the sum and stop
        if (i < 0) {
            System.err.println("Value of Sum is ==> " + sum);
            return;
        }

        sumOfGivenNumbers(i - 1, sum + i); // Recursive call with decreased i and increased sum
    }

    // Functional recursion to compute sum of all numbers from 'sum' down to 0
    static int sumOfGivenNumbersFunctionalMethod(int sum) {

        // Base condition: when sum reaches 0, return 0
        if (sum == 0) {
            return 0;
        }

        // Recursive call that adds the current sum and decreases sum
        return sum + sumOfGivenNumbersFunctionalMethod(sum - 1);
    }

    // Recursive method to calculate the sum of cubes of numbers from 'num' to 1
    static long SumofFirstNTerms(long num) {

        // Base condition: when num reaches 0, return 0
        if (num == 0) {
            return 0;
        }

        long sum = num * num * num; // Calculate the cube of the current number
        System.out.println("Value of N is : " + num + " and Sum is : " + sum);

        // Recursive call to add the cubes of the remaining numbers
        return sum + SumofFirstNTerms(num - 1);
    }

    // Functional recursion to calculate the factorial of a given number
    static int factorialOfGivenNumbersFunctionalMethod(int sum) {

        // Base condition: factorial of 0 is 1
        if (sum == 0) {
            return 1;
        }

        // Recursive call to multiply the current number by the factorial of (sum - 1)
        return sum * factorialOfGivenNumbersFunctionalMethod(sum - 1);
    }

    // Method to find all factorial numbers less than or equal to a given number 'num'
    static ArrayList<Long> Find_all_factorial_numbers_less_than_or_equal_to_n(long num) {

        ArrayList<Long> result = new ArrayList<>(); // List to store factorial numbers

        // Start with fact = 1! and number = 1
        findFactorialRecursively(1, 1, num, result);
        return result; // Return the list of factorials
    }

    // Helper recursive function to compute factorial numbers
    static void findFactorialRecursively(long num, long fact, long n, ArrayList<Long> result) {

        // Base condition: if factorial exceeds n, stop
        if (fact > n) {
            return;
        }

        result.add(fact); // Add the current factorial to the result list

        // Recursive call for the next factorial (num + 1)!
        findFactorialRecursively(num + 1, fact * (num + 1), n, result);
    }

    // Method to reverse and print the array
    static void ReverseAnArray(int[] arry, int start , int end) {

    	
    	if(start<end) {
        	int temp = arry[start];
        	arry[start] = arry[end];
        	arry[end] = temp;
        	
        	ReverseAnArray(arry, start+1, end-1);
        	
    	}
    	System.out.print("Reversed Array is :=> " + Arrays.toString(arry));
    }
    
    
    //Missing in Array
  static    int missingNumber(int n, int arr[]) {

	   // Approach:
	    // Sum of the first n natural numbers: The sum of the numbers from 1 to n is given by the formula:
	    // Sum(1 to n) = n * (n + 1) / 2

	    // Sum of elements in the array: Compute the sum of all elements present in the array.
	    
	    // Missing element: The missing element is the difference between the sum of the first n 
	    // natural numbers and the sum of the elements in the array.

	    // Algorithm:
	    // 1. Compute the sum of the first n natural numbers.
	    // 2. Compute the sum of the array.
	    // 3. The difference between these two sums will give the missing element.
	  
	  
	  int totalSum = (n	* (n+1))/2;
	  

	  int arraySum  = 0 ; 
	  
	  for(int i=0;i<=arr.length;i++) {
		  arraySum +=arr[i];
	  }
	  
	  return totalSum-arraySum;
	  
  }
  
  
  static int fiboRecursive(int n) {
	  
	  if(n <=1) {
		  System.out.println(" Value of n in If is :=> " + n);
		  return n;
	  }
	  int first  = fiboRecursive(n-1);
	  int last = fiboRecursive(n-2);
	  return first+last;

  //Another solution 
	  
//	  if(n==0 || n== 1)
//          return n;
//       return fib(n-1) + fib(n-2);
  
  }
    

}
